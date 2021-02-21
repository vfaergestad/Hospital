package mappe.del1.hospital.healthpersonnel.doctor;

import mappe.del1.hospital.Patient;

/**
 * Represents one general practitioner at the hospital.
 * @author Vegard Færgestad
 */
public class GeneralPractitioner extends Doctor{

    /**
     * Constructor for class GeneralPractitioner.
     * @param firstName General practitioner firstname.
     * @param lastName General practitioner lastname.
     * @param socialSecurityNumber General practitioner social security number.
     */
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Sets the patients diagnose to the given diagnose.
     * @param patient Patient to be diagnosed.
     * @param diagnosis Diagnose to be set.
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
