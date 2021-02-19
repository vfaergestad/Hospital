package Personnel;

/**
 * Represents one person at the hospital.
 * Includes persons name and social security number.
 * @author Vegard Færgestad
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Constructor for det class Personnel.Person.
     * @param firstName Firstname of the person. Cannot be null or blank.
     * @param lastName Lastname of the person. Cannot be null or blank.
     * @param socialSecurityNumber Social security number of the person. Cannot be null or blank.
     * @throws IllegalArgumentException Throws when parameter requirements are not met.
     */
    public Person(String firstName, String lastName, String socialSecurityNumber) throws IllegalArgumentException{
        if (firstName == null || firstName.isBlank()){
            throw new IllegalArgumentException("Firstname cannot be empty.");
        } else {
            this.firstName = firstName;
        }

        if (lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("Lastname cannot be empty.");
        } else {
            this.firstName = lastName;
        }

        if (socialSecurityNumber == null || socialSecurityNumber.isBlank()){
            throw new IllegalArgumentException("Social security number cannot be empty.");
        } else {
            this.firstName = socialSecurityNumber;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Persons full name as string.
     */
    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Personnel.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
