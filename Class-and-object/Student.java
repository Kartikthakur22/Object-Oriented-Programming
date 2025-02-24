public class Student {
    private String name;
    private int rollNumber;
    private double marks;
    public Student(String name,int rollNumber,double marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public char calculateGrade(){
        if(marks>=90){
            return 'A';
        }
        else if(marks>=80){
            return 'B';
        }
        else if(marks>=70){
            return 'C';
        }
        else if(marks>=60){
            return 'D';
        }
        else if(marks>=50){
            return 'E';
        }
        else{
            return 'F';
        }
    }
    public void displayDetails(){
        char grade=calculateGrade();
        System.out.println("Student name : "+name);
        System.out.println("Student roll number : "+rollNumber);
        System.out.println("Student marks : "+marks);
        System.out.println("Student grade : "+grade);
    }
    public static void main(String[] args) {
        Student student1=new Student("Kartik", 123, 91);
        student1.displayDetails();
    }
}
