package PracticeArraysAndMethods;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int input;
//
//        do {
//            System.out.println("Enter number 1 to convert celsius to fahrenheit or " +
//                    "number 2 to convert fahrenheit to celsius.");
//            input = scanner.nextInt();
//            if (input == 1)
//                break;
//            if (input == 2)
//                break;
//        }while (true);
//
//        if (input == 1){
//            System.out.println("Enter celsius :");
//            double celsius = scanner.nextDouble();
//            System.out.println("Fahrenheit:" + celsiusToFahrenheit(celsius));
//        } else {
//            System.out.println("Enter fahrenheit :");
//            double fahrenheit = scanner.nextDouble();
//            System.out.println("Celsius:" + fahrenheitToCelsius(fahrenheit));
//        }
//    }
//
//    public static double celsiusToFahrenheit(double celsius){
//        return celsius/(5.0 / 9) +32;
//    }
//
//    public static double fahrenheitToCelsius(double fahrenheit){
//        return (5.0 / 9) * (fahrenheit - 32);

    Scanner sc = new Scanner(System.in);
    int check ;
    while (true) {
        System.out.println("Enter number 1 to convert celsius to fahrenheit \n" +
                            "Enter number 2 to convert fahrenheit to celsius \n" +
                            "Enter number 3 to exit");
        check = sc.nextInt();
        switch (check) {
            case 1:
                System.out.println("Enter celsius :");
                double celsius = sc.nextDouble();
                System.out.println("Fahrenheit:" + celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.println("Enter fahrenheit :");
                double fahrenheit = sc.nextDouble();
                System.out.println("Celsius:" + fahrenheitToCelsius(fahrenheit));
                break;
            case 3:
                System.exit(3);
        }
    }

    }
    public static double celsiusToFahrenheit(double celsius){
        return celsius/(5.0 / 9) +32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
