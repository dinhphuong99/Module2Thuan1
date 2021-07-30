package Exercise;

import Pratice.Rectangle;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c, delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = this.b*this.b -4*this.a*this.c;
    }

    public double getRoot1(){
        return (-this.b + Math.sqrt(this.delta))/(2*a);
    }

    public double getRoot2(){
        return (-this.b - Math.sqrt(this.delta))/(2*a);
    }

    public void display(){
        if (this.delta < 0){
            System.out.println("The equation has no roots");
        }else if(this.delta == 0) {
            System.out.println("Root: " + getRoot1());
        }else {
            System.out.println("Root1: " + getRoot1());
            System.out.println("Root2: " + getRoot2());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            System.out.print("Enter the first coefficient:");
            a = scanner.nextDouble();
            if (a!=0)
                break;
        }while (true);

        System.out.print("Enter the second coefficient:");
        double b = scanner.nextDouble();

        System.out.print("Enter the third coefficient:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println();
        quadraticEquation.display();
    }
}
