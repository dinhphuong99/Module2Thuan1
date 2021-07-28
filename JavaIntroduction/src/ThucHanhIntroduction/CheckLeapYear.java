package ThucHanhIntroduction;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        System.out.printf("Input year: ");
        Scanner scanner = new Scanner(System.in);
        
        int year = scanner.nextInt();
        boolean leapYear = false;
        if (year%4==0 && year%100!=0) {
            leapYear = true;
        } else if (year%100==0 && year%400 ==0) {
            leapYear = true;
        }

        if(leapYear){
            System.out.printf("This is a leap year");
        } else {
            System.out.printf("This is not a leap year");
        }
    }
}
