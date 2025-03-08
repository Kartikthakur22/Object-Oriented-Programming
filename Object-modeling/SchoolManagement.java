import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}

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

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Ensuring bi-directional relationship
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println(name + " is not enrolled in any courses.");
            return;
        }
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }
}

class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void listStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student john = new Student("John");
        Student mary = new Student("Mary");
        Student james = new Student("James");

        school.addStudent(john);
        school.addStudent(mary);
        school.addStudent(james);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        john.enrollInCourse(math);
        john.enrollInCourse(science);
        mary.enrollInCourse(math);
        mary.enrollInCourse(history);
        james.enrollInCourse(science);

        john.viewCourses();
        mary.viewCourses();
        james.viewCourses();

        math.listStudents();
        science.listStudents();
        history.listStudents();

        school.listStudents();
    }
}
