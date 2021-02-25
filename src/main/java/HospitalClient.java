import mappe.del1.hospital.Department;
import mappe.del1.hospital.Employee;
import mappe.del1.hospital.Hospital;
import mappe.del1.hospital.Patient;
import mappe.del1.hospital.exception.RemoveException;

/**
 * Class for testing some of the hospitals functionality.
 * @author Vegard Færgestad
 */
public class HospitalClient {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Sykehuset");
        HospitalTestData.fillRegisterWithTestData(hospital);

        Department emergency = hospital.getDepartments().get("Akutten");
        Employee employee = new Employee("Kristian", "Bergsjø", "21020069696");
        emergency.addEmployee(employee);
        try {
            emergency.remove(employee);
            System.out.println(employee.getFullNavn() + " was added to " + emergency.getDepartmentName());
        } catch (RemoveException e){
            System.out.println(e.getMessage());
        }

        Patient patient = new Patient("Marius", "Strengen", "01120096969");
        try {
            emergency.remove(patient);
        } catch (RemoveException e){
            System.out.println(e.getMessage());
        }
    }
}
