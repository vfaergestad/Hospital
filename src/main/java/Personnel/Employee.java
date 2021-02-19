package Personnel;

/**
 * Represents one employee at the hospital.
 * @author Vegard Færgestad
 */
public class Employee extends Person {

    /**
     * Constructor for class employee.
     * @param firstName Employee firstname.
     * @param lastName Employee lastname.
     * @param socialSecurityNumber Employee social security number.
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }
}
