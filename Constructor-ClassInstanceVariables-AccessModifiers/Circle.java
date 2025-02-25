public class Circle {
    private double radius;
    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public void getRadius(){
        System.out.println("Radius of circle : "+radius);
    }
    public static void main(String[] args) {
        Circle circle1=new Circle(5);
        circle1.getRadius();
        Circle circle2=new Circle();
        circle2.getRadius();
    }
}
