package mappe.del1.hospital;

import java.util.Objects;

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
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException{
        if (firstName == null || firstName.isBlank()){
            throw new IllegalArgumentException("Firstname cannot be empty.");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalArgumentException{
        if (lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("Lastname cannot be empty.");
        } else {
            this.lastName = lastName;
        }
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

    public void setSocialSecurityNumber(String socialSecurityNumber) throws IllegalArgumentException{
        if (socialSecurityNumber == null || socialSecurityNumber.isBlank()){
            throw new IllegalArgumentException("Social security number cannot be empty.");
        } else {
            this.socialSecurityNumber = socialSecurityNumber;
        }
    }

    @Override
    public String toString() {
        return "Personnel.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getSocialSecurityNumber().equals(person.getSocialSecurityNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSocialSecurityNumber());
    }
}
