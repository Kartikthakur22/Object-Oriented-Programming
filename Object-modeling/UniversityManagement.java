import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void listDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    public void closeUniversity() {
        departments.clear();  // Removes all departments (and consequently their associated faculty members)
        System.out.println("University " + name + " is closed, and all departments are deleted.");
    }
}

class Department {
    private String name;
    private List<Faculty> facultyMembers;

    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        facultyMembers.remove(faculty);
    }

    public void listFaculty() {
        System.out.println("Faculty members in " + name + " department:");
        for (Faculty faculty : facultyMembers) {
            System.out.println(faculty.getName());
        }
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University("Global Tech University");

        Department computerScience = new Department("Computer Science");
        Department mechanicalEngineering = new Department("Mechanical Engineering");

        Faculty drSmith = new Faculty("Dr. Smith");
        Faculty drJones = new Faculty("Dr. Jones");
        Faculty profTaylor = new Faculty("Prof. Taylor");

        university.addDepartment(computerScience);
        university.addDepartment(mechanicalEngineering);

        computerScience.addFaculty(drSmith);
        computerScience.addFaculty(drJones);
        mechanicalEngineering.addFaculty(profTaylor);

        university.listDepartments();
        computerScience.listFaculty();
        mechanicalEngineering.listFaculty();

        // Deleting the university will also delete its departments
        university.closeUniversity();

        // After closing the university, we can still have independent faculty members
        System.out.println("Faculty members after university closure:");
        System.out.println(drSmith.getName());
        System.out.println(drJones.getName());
        System.out.println(profTaylor.getName());
    }
}
