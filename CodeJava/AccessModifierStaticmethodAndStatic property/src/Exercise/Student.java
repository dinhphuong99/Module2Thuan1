package Exercise;

public class Student {
    private String name =  "John";
    private String classes = "CO2";

    public Student(){
        this.name = "John";
        this.classes = "CO2";
    };

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + this.name +"\n" + "Class: " + this.classes + "\n");
    }
}
