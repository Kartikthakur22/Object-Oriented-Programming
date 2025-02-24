public class Employee{
    private String name;
    private long id;
    private int salary;
    public Employee(String name,long id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name of employee : "+name);
        System.out.println("Employee Id : "+id);
        System.out.println("Salary of employee : "+salary);
    }
    public static void main(String[] args) {
        Employee employee1=new Employee("Kartik", 012345, 70000);
        employee1.displayDetails();
    }
}