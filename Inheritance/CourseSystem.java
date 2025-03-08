package Inheritance;
class Course {
    protected String courseName;
    protected int duration;  // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
    }
}
class CourseSystem{
    public static void main(String[] args) {
        Course course = new Course("Basic Java Programming", 40);
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java Programming", 50, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Java Masterclass", 60, "Coursera", false, 200, 10);

        System.out.println("Course Info:");
        course.displayCourseInfo();
        System.out.println();

        System.out.println("Online Course Info:");
        onlineCourse.displayCourseInfo();
        System.out.println();

        System.out.println("Paid Online Course Info:");
        paidOnlineCourse.displayCourseInfo();
    }
}