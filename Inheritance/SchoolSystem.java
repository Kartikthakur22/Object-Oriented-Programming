package Inheritance;

class Person{
    protected String name;
    protected int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void displayRole(){
        System.out.println("Role:Nothing");
    }
}
class Teacher extends Person{
    private String subject;
    public Teacher(String name,int age,String subject){
        super(name, age);
        this.subject=subject;
    }
    public void displayRole(){
        System.out.println("Role:Teaching");
    }
}
class Student extends Person{
    private char grade;
    public Student(String name,int age,char grade){
        super(name, age);
        this.grade=grade;
    }
    public void displayRole(){
        System.out.println("Role:Studying");
    }
}
class Staff extends Person {
    private String position;
    public Staff(String name, int age, String position) {
        super(name, age);  
        this.position = position;
    }
    public void displayRole() {
        System.out.println(" Staff member working as " + position);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("Alice", 16, 'A');
        Staff staff = new Staff("Mrs. Brown", 45, "Administrator");
        teacher.displayRole();
        teacher.displayRole();
        System.out.println();
    }
}
