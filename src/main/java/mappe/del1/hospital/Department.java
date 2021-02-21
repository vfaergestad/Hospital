package mappe.del1.hospital;

import Personnel.*;
import mappe.del1.hospital.exception.RemoveException;

import java.util.HashMap;
import java.util.Objects;

/**
 * Represents one department at the hospital.
 * @author Vegard Færgestad
 */
public class Department {

    private String departmentName;
    private HashMap<String, Employee> employees;
    private HashMap<String, Patient> patients;

    /**
     * Constructor for class mappe.del1.hospital.Department.
     * @param departmentName Name of the department.
     */
    public Department(String departmentName){
        setDepartmentName(departmentName);
        employees = new HashMap<>();
        patients = new HashMap<>();
    }

    /**
     * Sets the department name.
     * @param departmentName Name to be set. Cannot be null or blank.
     * @throws IllegalArgumentException Thrown if name is null or blank.
     */
    public void setDepartmentName(String departmentName) throws IllegalArgumentException{
        if (departmentName == null || departmentName.isBlank()){
            throw new IllegalArgumentException("mappe.del1.hospital.Department name cannot be empty.");
        } else {
            this.departmentName = departmentName;
        }
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public HashMap<String, Employee> getEmployees(){
        return employees;
    }

    /**
     * Adds one employee to the department.
     * @param employee Employee to be added.
     * @throws IllegalArgumentException Thrown if employee is null.
     */
    public void addEmployee(Employee employee) throws IllegalArgumentException{
        if (employee == null){
            throw new IllegalArgumentException("Employee cannot be null");
        } else {
            employees.put(employee.getFullName(), employee);
        }
    }

    public HashMap<String, Patient> getPatients(){
        return patients;
    }

    /**
     * Adds one patient to the department.
     * @param patient Employee to be added.
     * @throws IllegalArgumentException Thrown if patient is null.
     */
    public void addPatient(Patient patient) throws IllegalArgumentException{
        if (employees == null) {
            throw new IllegalArgumentException("Patient cannot be null");
        } else {
            patients.put(patient.getFullName(), patient);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return getDepartmentName().equals(that.getDepartmentName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentName());
    }

    @Override
    public String toString() {
        return "mappe.del1.hospital.Department{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }

    /**
     * Removes person from the department.
     * @param person Patient or employee to be removed.
     * @throws RemoveException Thrown if the person is not in the register, or not a patient or an employee.
     */
    public void remove(Person person) throws RemoveException {
        if (person instanceof Employee) {
            if (employees.remove(person.getFullName()) == null) {
                throw new RemoveException(person.getFullName() + " is not in the department.");
            }
        } else if (person instanceof Patient) {
           if (patients.remove(person.getFullName()) == null){
               throw new RemoveException(person.getFullName() + " is not in the department.");
            }
        } else {
            throw new RemoveException(person.getFullName() + " is not a patient or an employee.");
        }
    }
}
