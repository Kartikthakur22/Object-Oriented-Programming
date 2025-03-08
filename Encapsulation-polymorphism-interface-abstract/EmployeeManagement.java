interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }

    // Getter and Setter methods for encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Full-time employees get fixed salary
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * workHours; // Part-time employees are paid based on work hours
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    // Getter and Setter for work hours
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(101, "John Doe", 5000);
        Employee partTimeEmployee = new PartTimeEmployee(102, "Jane Smith", 20, 100);

        // Assigning departments
        ((FullTimeEmployee) fullTimeEmployee).assignDepartment("IT");
        ((PartTimeEmployee) partTimeEmployee).assignDepartment("HR");

        // Displaying employee details
        fullTimeEmployee.displayDetails();
        System.out.println(((FullTimeEmployee) fullTimeEmployee).getDepartmentDetails());

        System.out.println();

        partTimeEmployee.displayDetails();
        System.out.println(((PartTimeEmployee) partTimeEmployee).getDepartmentDetails());
    }
}
