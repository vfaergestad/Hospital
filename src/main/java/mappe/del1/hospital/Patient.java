package mappe.del1.hospital;

/**
 * Represents one patient at the hospital.
 * @author Vegard Færgestad
 */
public class Patient extends Person implements Diagnosable {
    private String diagnosis;

    /**
     * Constructor for class Patient.
     * @param firstName Patient firstname.
     * @param lastName Patient lastname.
     * @param socialSecurityNumber Patient social security number.
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * @return Diagnosis of patient.
     */
    public String getDiagnosis(){
        return this.diagnosis;
    }

    /**
     * Sets the patients diagnose to the given diagnose.
     * @param diagnosis Diagnose to be set.
     */
    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }

}
