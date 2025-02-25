public class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
    }
}

class Manager extends Employee {
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.getSalary());
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("E123", "Finance", 50000);
        employee1.displayEmployeeDetails();
        employee1.setSalary(55000);
        System.out.println("\nAfter modifying salary:");
        employee1.displayEmployeeDetails();

        Manager manager1 = new Manager("M456", "HR", 75000);
        manager1.displayManagerDetails();
    }
}
