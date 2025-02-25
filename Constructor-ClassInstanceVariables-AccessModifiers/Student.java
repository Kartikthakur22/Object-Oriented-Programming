public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber,String name,double CGPA){
        this.rollNumber=rollNumber;
        this.name=name;
        this.CGPA=CGPA;
    }
    public double getCGPA(){
        return this.CGPA;
    }
    public void setCGPA(double CGPA){
        this.CGPA=CGPA;
    }
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.CGPA);
    }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);  
        System.out.println("CGPA: " + this.getCGPA());  
    }
}
class Main{
    public static void main(String[] args) {
        Student student1 = new Student(101, "John Doe", 8.5);
        student1.displayStudentDetails();
        student1.setCGPA(9.0);

        student1.displayStudentDetails();

        PostgraduateStudent pgStudent =new PostgraduateStudent(102, "Jane Smith", 8.8);
        pgStudent.displayPostgraduateDetails();
    }
}