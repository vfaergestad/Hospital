import java.util.HashMap;

/**
 * Represents one hospital.
 * @author Vegard Færgestad
 */
public class Hospital {

    private final String hospitalName;
    private HashMap<String, Department> departments;

    /**
     * Constructor for class Hospital.
     * @param hospitalName Name of the hospital.
     * @throws IllegalArgumentException Thrown if hospital name is null or blank.
     */
    public Hospital(String hospitalName) throws IllegalArgumentException{
        if (hospitalName == null || hospitalName.isBlank()){
            throw new IllegalArgumentException("Hospital name cannot be empty.");
        } else {
            this.hospitalName = hospitalName;
        }
        departments = new HashMap<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public HashMap<String, Department> getDepartments() {
        return departments;
    }

    /**
     * Adds one department to the hospital.
     * @param department Deparment to be added.
     * @throws IllegalArgumentException Thrown if department is null.
     */
    public void addDepartment(Department department) throws IllegalArgumentException{
        if (department == null) {
            throw new IllegalArgumentException("Department cannot be null.");
        } else {
            departments.put(department.getDepartmentName(), department);
        }
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                '}';
    }
}
