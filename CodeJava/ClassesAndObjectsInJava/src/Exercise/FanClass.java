package Exercise;

public class FanClass {
    final int SLOW = 1, MEDIUM = 2, FAST =3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public int getSpeed(){
        return this.speed;
    }

    public  boolean getOn(){
        return this.on;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public FanClass(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public FanClass(int speed, boolean on, String color, double radius){
        this.setColor(color);
        this.setOn(on);
        this.setRadius(radius);
        this.setSpeed(speed);
    }

    @Override
    public String toString() {
        String statetus = "";
        if (this.getOn()) {
            statetus += ("Fan is on\n");
            statetus += ("Speed: " + this.speed + "\n");
        } else {
            statetus += ("Fan is off\n");
        }
        statetus += ("Color: " + this.color + "\n");
        statetus += ("Radius: " + this.radius + "\n");
        return statetus;
    }

    public static void main(String[] args) {
        FanClass fan1 =new FanClass(3,true,"green",10);
        FanClass fan2 =new FanClass(2,false,"black",5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
