package ThucHanhJavaLoop;

import java.util.Scanner;

public class DrawMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 5; i>0; i--){
                        for (int j = i; j > 0; j--){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Draw the square");
                    for (int i = 5; i>0; i--){
                        for (int j = 5; j > 0; j--){
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i = 4; i>0; i--){
                        for (int j = 7; j > 0; j--){
                            System.out.printf("*");
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
