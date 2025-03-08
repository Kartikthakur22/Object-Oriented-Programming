import java.util.ArrayList;
import java.util.List;

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void listDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }
    }

    public void listPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println(name + " is consulting " + patient.getName() + ".");
    }

    public void listPatients() {
        System.out.println(name + " is seeing the following patients:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println(name + " has been consulted by " + doctor.getName() + ".");
    }

    public void listDoctors() {
        System.out.println(name + " has consulted the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor drSmith = new Doctor("Dr. Smith");
        Doctor drJones = new Doctor("Dr. Jones");
        Doctor drTaylor = new Doctor("Dr. Taylor");

        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addDoctor(drTaylor);

        hospital.addPatient(alice);
        hospital.addPatient(bob);

        drSmith.consult(alice);
        drJones.consult(alice);
        drTaylor.consult(bob);

        alice.addDoctor(drSmith);
        alice.addDoctor(drJones);
        bob.addDoctor(drTaylor);

        drSmith.listPatients();
        drJones.listPatients();
        drTaylor.listPatients();

        alice.listDoctors();
        bob.listDoctors();
    }
}
