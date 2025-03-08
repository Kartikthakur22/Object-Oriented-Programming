import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
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
        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
        }
    }

    public void closeCompany() {
        departments.clear(); // Removes all departments (and consequently, employees)
        System.out.println("Company " + name + " is closed and all departments and employees are deleted.");
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void listEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName());
        }
    }

    public void closeDepartment() {
        employees.clear(); // Removes all employees when department is closed
        System.out.println("Department " + name + " is closed and all employees are deleted.");
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class CompanyManagent {
    public static void main(String[] args) {
        
    }
}
