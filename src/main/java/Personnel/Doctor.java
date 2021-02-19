package Personnel;

/**
 * Represents one Doctor at the hospital.
 * @author Vegard Færgestad
 */
public abstract class Doctor extends Employee {

    /**
     * Constructor for class Doctor.
     * @param firstName Doctor firstname.
     * @param lastName Doctor lastname.
     * @param socialSecurityNumber Doctor social security number.
     */
    public Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Sets a diagnosis for a given patient.
     * @param patient Patient to be diagnosed.
     * @param diagnosis Diagnose to be set.
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);

}
