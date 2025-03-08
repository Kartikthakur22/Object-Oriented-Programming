abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRoomCharge;
    private int daysAdmitted;
    private String medicalHistory;

    public InPatient(String patientId, String name, int age, double dailyRoomCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRoomCharge = dailyRoomCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        return (dailyRoomCharge * daysAdmitted);
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return medicalHistory;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return medicalHistory;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("IP001", "John Doe", 45, 200.0, 5);
        Patient outPatient = new OutPatient("OP001", "Jane Smith", 30, 100.0);

        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill: $" + inPatient.calculateBill());
        System.out.println("Adding Medical Record for InPatient...");
        ((InPatient) inPatient).addRecord("Admitted for surgery. Recovery ongoing.");
        System.out.println("Medical Records: \n" + ((InPatient) inPatient).viewRecords());

        System.out.println("\n" + outPatient.getPatientDetails());
        System.out.println("Bill: $" + outPatient.calculateBill());
        System.out.println("Adding Medical Record for OutPatient...");
        ((OutPatient) outPatient).addRecord("Consulted for routine checkup. No issues found.");
        System.out.println("Medical Records: \n" + ((OutPatient) outPatient).viewRecords());
    }
}
