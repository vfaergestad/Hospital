package mappe.del1.hospital;

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
    public Person(String firstName, String lastName, String socialSecurityNumber){
        setFirtName(firstName);
        setLastName(lastName);
        setPersonnummer(socialSecurityNumber);
    }

    /**
     * @return Persons first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets persons first name to the given string.
     * @param firstName First name to be set. String type.
     * @throws IllegalArgumentException Thrown if parameter is null or blank.
     */
    public void setFirtName(String firstName) throws IllegalArgumentException{ // Method name is written wrong to follow the class diagram.
        if (firstName == null || firstName.isBlank()){
            throw new IllegalArgumentException("Firstname cannot be empty.");
        } else {
            this.firstName = firstName;
        }
    }

    /**
     * @return Persons last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets persons last name to the given string.
     * @param lastName Last name to be set. String type.
     * @throws IllegalArgumentException Thrown if parameter is null or blank.
     */
    public void setLastName(String lastName) throws IllegalArgumentException{
        if (lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("Lastname cannot be empty.");
        } else {
            this.lastName = lastName;
        }
    }

    /**
     * @return Persons full name.
     */
    public String getFullNavn(){ // Method name is written wrong to follow the class diagram.
        return getFirstName() + " " + getLastName();
    }

    /**
     * @return Persons Social Security Number.
     */
    public String getPersonnummer() { //Method name is wrong to follow the class diagram.
        return socialSecurityNumber;
    }

    /**
     * Sets persons social security number to a given string
     * @param socialSecurityNumber Social Security Number to be set. Cannot be blank or null.
     * @throws IllegalArgumentException Thrown if parameter is blank or null.
     */
    public void setPersonnummer(String socialSecurityNumber) throws IllegalArgumentException{ // Method name is written wrong to follow the class diagram.
        if (socialSecurityNumber == null || socialSecurityNumber.isBlank()){
            throw new IllegalArgumentException("Social security number cannot be empty.");
        } else {
            this.socialSecurityNumber = socialSecurityNumber;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
