package ExerciseArrayAndMethods;

import java.util.Scanner;

public class FindMaxIn2DimensionalArrays {
    public static void main(String[] args) {
        int row;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row of the array: ");
        row = scanner.nextInt();

        int col;
        System.out.println("Enter the row of the array: ");
        col = scanner.nextInt();

        int [][] arrayRandom = new int[row][col];

        System.out.println("Array is created: ");
        for (int i = 0; i< row; i++){
            for (int j = 0; j < col; j++) {
                arrayRandom[i][j] = (int) Math.floor(Math.random()*10 + 1);
            }
        }

        int max = arrayRandom[0][0];

        for (int i = 0; i< row; i++){
            for (int j = 0; j < col; j++) {
                if (max < arrayRandom[i][j]){
                    max = arrayRandom[i][j];
                }
            }
        }

        for (int i = 0; i< row; i++){
            for (int j = 0; j < col; j++) {
                System.out.printf(arrayRandom[i][j] +" ");
            }
            System.out.printf("\n");
        }

        System.out.println("Max is: " + max);
    }
}
