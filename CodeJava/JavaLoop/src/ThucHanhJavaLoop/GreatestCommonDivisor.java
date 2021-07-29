package ThucHanhJavaLoop;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int number1 = Math.abs(scanner.nextInt());

        System.out.println("Enter the second integer");
        int number2 = Math.abs(scanner.nextInt());

        if (number1 == 0 && number2 ==0){
            System.out.println("No greatest common divisor");
        } else if (number1 != 0 && number2 !=0){
            while (number1 != number2) {

                if (number1 > number2)
                    number1 = number1 - number2;
                else
                    number2 = number2 - number1;
            }
            System.out.println(number1);
        }
        else if (number1 < number2)
            System.out.println(number2);
        else
            System.out.println(number1);

    }
}
