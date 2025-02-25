public class Course {
    private String courseName;
    private String duration;
    private double fee;
    private static String instituteName="Chitkara";
    public Course(String courseName,String duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    public void displayCourseDetails(){
        System.out.println("Course name:"+courseName);
        System.out.println("Duration:"+duration);
        System.out.println("Fee:"+fee);
        System.out.println("Institute:"+instituteName);
    }
    public static void updateInstituteName(String newInstitute){
        Course.instituteName=newInstitute;
    }
    public static void main(String[] args) {
        Course course1 = new Course("Full Stack", "6 months", 500);
        Course course2 = new Course("DSA", "4 months", 500);

        course1.displayCourseDetails();
        course2.displayCourseDetails();
        Course.updateInstituteName("Tech Academy");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
