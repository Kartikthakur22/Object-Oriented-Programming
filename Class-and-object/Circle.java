public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public void displayDetails(){
        System.out.println("Radius of circle : "+radius);
        System.out.println("Area of circle : "+area());
        System.out.println("Circumference of circle : "+circumference());
    }
    public static void main(String[] args) {
        Circle circle1=new Circle(5);
        circle1.displayDetails();
    }
}
