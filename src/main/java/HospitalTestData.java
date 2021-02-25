import mappe.del1.hospital.healthpersonnel.Nurse;
import mappe.del1.hospital.healthpersonnel.doctor.GeneralPractitioner;
import mappe.del1.hospital.healthpersonnel.doctor.Surgeon;
import mappe.del1.hospital.*;
public final class HospitalTestData {
    private HospitalTestData() {
        // not called
    }
    /**
     * Fills a given hospital with test data.
     * @param hospital Name of hospital to fill with data.
     */
    public static void fillRegisterWithTestData(final Hospital hospital) {
        // Add some departments
        Department emergency = new Department("Akutten");

        Employee employee = new Employee("Odd Even", "Primtallet", "1");
        emergency.getEmployees().put(employee.getFullNavn(), employee);

        employee = new Employee("Huppasahn", "DelFinito", "2");
        emergency.getEmployees().put(employee.getFullNavn(), employee);

        employee = new Employee("Rigmor", "Mortis", "3");
        emergency.getEmployees().put(employee.getFullNavn(), employee);

        Surgeon surgeon = new Surgeon("Inco", "Gnito", "4");
        emergency.getEmployees().put(surgeon.getFullNavn(), surgeon);

        Nurse nurse = new Nurse("Nina", "Teknologi", "5");
        emergency.getEmployees().put(nurse.getFullNavn(), nurse);

        nurse = new Nurse("Ove", "Ralt", "6");
        emergency.getEmployees().put(nurse.getFullNavn(), nurse);

        Patient patient = new Patient("Inga", "Lykke", "7");
        emergency.getPatients().put(patient.getFullNavn(), patient);

        patient = new Patient("Ulrik", "Smål", "8");
        emergency.getPatients().put(patient.getFullNavn(), patient);

        hospital.getDepartments().put(emergency.getDepartmentName(), emergency);


        Department childrenPolyclinic = new Department("Barn poliklinikk");

        employee = new Employee("Salti", "Kaffen", "9");
        childrenPolyclinic.getEmployees().put(employee.getFullNavn(), employee);

        employee = new Employee("Nidel V.", "Elvefølger", "10");
        childrenPolyclinic.getEmployees().put(employee.getFullNavn(), employee);

        employee = new Employee("Anton", "Nym", "11");
        childrenPolyclinic.getEmployees().put(employee.getFullNavn(), employee);

        GeneralPractitioner generalPractitioner = new GeneralPractitioner("Gene", "Sis", "12");
        childrenPolyclinic.getEmployees().put(generalPractitioner.getFullNavn(), generalPractitioner);

        surgeon = new Surgeon("Nanna", "Na", "13");
        childrenPolyclinic.getEmployees().put(surgeon.getFullNavn(), surgeon);

        nurse = new Nurse("Nora", "Toriet", "14");
        childrenPolyclinic.getEmployees().put(nurse.getFullNavn(), nurse);

        patient = new Patient("Hans", "Omvar", "15");
        childrenPolyclinic.getPatients().put(patient.getFullNavn(), patient);

        patient = new Patient("Laila", "La", "16");
        childrenPolyclinic.getPatients().put(patient.getFullNavn(), patient);

        patient = new Patient("Jøran", "Drebli", "17");
        childrenPolyclinic.getPatients().put(patient.getFullNavn(), patient);

        hospital.getDepartments().put(childrenPolyclinic.getDepartmentName(), childrenPolyclinic);
    }
}