package BaiTapJavaLoop;

import java.util.Scanner;

public class DisplayGraphic {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 5; i>0; i--){
                        for (int j = 5; j > 0; j--){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 5; i>=0; i--){
                        for (int j = 5; j > i; j--){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }

                    for (int i = 0; i<5; i++){
                        for (int j = 5; j > i; j--){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }

                    for (int i = 5; i>0; i--){
                        for (int j = 5; j > 0; j--){
                            if (i>=j)
                                System.out.printf("*");
                            else
                                System.out.printf(" ");
                        }
                        System.out.println();
                    }

                    for (int i = 0; i<5; i++){
                        for (int j = 0; j <5; j++){
                            if (j >=5-i-1)
                                System.out.printf("*");
                            else
                                System.out.printf(" ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Print isosceles triangle");

                    for (int i = 0; i < 4; i++){
                        for (int j = 0; j < 9; j++){
                            if (j >= 5 - i && j <= 5 + i)
                                System.out.printf("*");
                            else
                                System.out.printf(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
