package mappe.del1.hospital.healthpersonnel.doctor;

import mappe.del1.hospital.Patient;

/**
 * Represents one surgeon at the hospital.
 * @author Vegard Færgestad
 */
public class Surgeon extends Doctor{

    /**
     * Constructor for class Surgeon.
     * @param firstName Surgeon firstname.
     * @param lastName Surgeon lastname.
     * @param socialSecurityNumber Surgeon social security number.
     */
    public Surgeon(String firstName, String lastName, String socialSecurityNumber){
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
