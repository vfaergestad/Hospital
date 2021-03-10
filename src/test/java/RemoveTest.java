import mappe.del1.hospital.Department;
import mappe.del1.hospital.exception.RemoveException;
import mappe.del1.hospital.healthpersonnel.doctor.GeneralPractitioner;
import mappe.del1.hospital.healthpersonnel.Nurse;
import mappe.del1.hospital.Patient;
import mappe.del1.hospital.healthpersonnel.doctor.Surgeon;
import org.junit.jupiter.api.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for testing the remove method in Department.
 */
public class RemoveTest {
    static Department department;
    static Surgeon surgeon;
    static Patient patient;
    static Nurse nurse;
    static Constructor<Patient> pat_constructor;
    static Class<Patient> pat = mappe.del1.hospital.Patient.class;

    /**
     * Adding test objects.
     *
     * @throws NoSuchMethodException     the no such method exception
     * @throws IllegalAccessException    the illegal access exception
     * @throws InvocationTargetException the invocation target exception
     * @throws InstantiationException    the instantiation exception
     */
    @BeforeAll
    static void addObjects() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // The following code is required to create a patient object to test with, since
        // the patient constructor is set to protected.
        pat_constructor = pat.getDeclaredConstructor(String.class, String.class, String.class);
        pat_constructor.setAccessible(true);
        patient = pat_constructor.newInstance("Marius", "Strengen", "01120096969");


        department = new Department("testDepartment");
        surgeon = new Surgeon("Kristian", "Bergsjø", "21020069696");
        nurse = new Nurse("Herman", "Erlandsen", "123456789");
        department.addEmployee(surgeon);
        department.addPatient(patient);
    }

    /**
     * Test that tries to remove existing employee from the department.
     */
    @Test
    void removeExistingEmployee(){
        assertTrue(department.getEmployees().containsKey(surgeon.getFullNavn()));
        try {
            department.remove(surgeon);
        } catch (RemoveException e){
            System.err.println("Error occurred in removeTest.");
        }
        assertFalse(department.getEmployees().containsKey(surgeon.getFullNavn()));
    }

    /**
     * Test that tries to remove existing patient from the department.
     */
    @Test
    void removeExistingPatient(){
        assertTrue(department.getPatients().containsKey(patient.getFullNavn()));
        try {
            department.remove(patient);
        } catch (RemoveException e){
            System.err.println("Error occurred in removeTest.");
        }
        assertFalse(department.getPatients().containsKey(patient.getFullNavn()));
    }

    /**
     * Test that tries to remove not existing employee from the department.
     */
    @Test
    void removeNotExistingEmployee(){
        GeneralPractitioner generalPractitioner = new GeneralPractitioner("Vegard",
                "Færgestad", "123456789");
        assertThrows(RemoveException.class, () -> department.remove(generalPractitioner));
    }

    /**
     * Test that tries to remove not existing patient from the department.
     */
    @Test
    void removeNotExistingPatient() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Patient patient = pat_constructor.newInstance("Kajsa", "Kirkhus", "987654321");
        assertThrows(RemoveException.class, () -> department.remove(patient));
    }
}
