import mappe.del1.hospital.Department;
import mappe.del1.hospital.exception.RemoveException;
import mappe.del1.hospital.healthpersonnel.doctor.GeneralPractitioner;
import mappe.del1.hospital.healthpersonnel.Nurse;
import mappe.del1.hospital.Patient;
import mappe.del1.hospital.healthpersonnel.doctor.Surgeon;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class removeTest {
    static Department department;
    static Surgeon surgeon;
    static Patient patient;
    static Nurse nurse;

    @BeforeAll
    static void addObjects(){
        department = new Department("testDepartment");
        surgeon = new Surgeon("Kristian", "Bergsjø", "21020069696");
        patient = new Patient("Marius", "Strengen", "01120096969");
        nurse = new Nurse("Herman", "Erlandsen", "123456789");
        department.addEmployee(surgeon);
        department.addPatient(patient);
    }

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

    @Test
    void removeWrongInstance(){
        assertThrows(RemoveException.class, () -> department.remove(nurse));
    }

    @Test
    void removeNotExistingEmployee(){
        GeneralPractitioner generalPractitioner = new GeneralPractitioner("Vegard",
                "Færgestad", "123456789");
        assertThrows(RemoveException.class, () -> department.remove(generalPractitioner));
    }

    @Test
    void removeNotExistingPatient(){
        Patient patient = new Patient("Kajsa", "Kirkhus", "987654321");
        assertThrows(RemoveException.class, () -> department.remove(patient));
    }
}
