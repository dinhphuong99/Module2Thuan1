package ThucHanhIntroduction;

import java.util.Scanner;

public class TinhNgayTrongThang {
    public static void main(String[] args) {
        System.out.printf("Enter month:");
        Scanner scaner = new Scanner(System.in);
        int month = scaner.nextInt();
        switch (month){
            case 2:
                System.out.printf("Month has 28 or 29 days");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Month has 30 days");

            default:
                System.out.printf("Invalid input");
                break;
        }
    }
}
