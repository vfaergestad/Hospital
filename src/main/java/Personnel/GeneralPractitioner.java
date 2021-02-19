package Personnel;

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


    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
