import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " has enrolled in " + course.getCourseName());
    }

    public void listCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.addProfessor(this);
        System.out.println(name + " is teaching " + course.getCourseName());
    }

    public void listCourses() {
        System.out.println(name + " teaches the following courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private List<Student> students;
    private List<Professor> professors;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void listStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public void listProfessors() {
        System.out.println("Professors teaching " + courseName + ":");
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }
}

public class UniversityManagement2 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Creating Professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Creating Courses
        Course course1 = new Course("Computer Science 101");
        Course course2 = new Course("Mathematics 101");

        // Students enrolling in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Professors assigning courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Listing courses for students
        student1.listCourses();
        student2.listCourses();

        // Listing courses for professors
        professor1.listCourses();
        professor2.listCourses();

        // Listing students in each course
        course1.listStudents();
        course2.listStudents();

        // Listing professors for each course
        course1.listProfessors();
        course2.listProfessors();
    }
}
