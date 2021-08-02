package Exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
        this.color = "red";
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.color = "red";
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
