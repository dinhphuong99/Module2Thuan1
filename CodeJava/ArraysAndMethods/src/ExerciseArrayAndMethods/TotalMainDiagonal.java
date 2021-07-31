package ExerciseArrayAndMethods;

import java.util.Scanner;

public class TotalMainDiagonal {
    public static void main(String[] args) {
        int row;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        row = scanner.nextInt();

        int [][] arrayRandom = new int[row][row];

        System.out.println("Array is created: ");
        for (int i = 0; i< row; i++){
            for (int j = 0; j < row; j++) {
                arrayRandom[i][j] = (int) Math.floor(Math.random()*10 + 1);
            }
        }

        for (int i = 0; i< row; i++){
            for (int j = 0; j < row; j++) {
                System.out.printf(arrayRandom[i][j] +" ");
            }
            System.out.printf("\n");
        }

        int sum = 0;
        for (int i = 0; i <row; i++) {
            sum = sum + arrayRandom[i][i];
        }

        System.out.println("Total main diagonal is: " + sum);
    }
}
