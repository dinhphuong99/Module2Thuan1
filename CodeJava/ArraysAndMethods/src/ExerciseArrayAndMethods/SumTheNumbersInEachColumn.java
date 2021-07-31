package ExerciseArrayAndMethods;

import java.util.Scanner;

public class SumTheNumbersInEachColumn {
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

        int []sumCol = new int[col];

        for (int i = 0; i< col; i++){
            for (int j = 0; j < row; j++) {
                sumCol[i] = sumCol[i] + arrayRandom[j][i];
            }
        }

        System.out.println("Sum the numbers in the columns: ");
        for (int i:
             sumCol) {
            System.out.printf(i + " ");
        }
    }
}
