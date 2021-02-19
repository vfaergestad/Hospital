package Personnel;

/**
 * Represents one nurse at the hospital.
 * @author Vegard Færgestad
 */
public class Nurse extends Employee{

    /**
     * Constructor for class Nurse.
     * @param firstName Nurse firstname.
     * @param lastName Nurse lastname.
     * @param socialSecurityNumber Nurse social security number.
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }
}
