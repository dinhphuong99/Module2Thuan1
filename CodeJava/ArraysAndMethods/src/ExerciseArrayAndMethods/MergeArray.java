package ExerciseArrayAndMethods;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array1: ");
        length = scanner.nextInt();

        int [] arrayRandom = new int[length];

        System.out.println("Array1 is created: ");
        for (int i = 0; i< length; i++){
            arrayRandom[i] = (int) Math.floor(Math.random()*10 + 1);
        }

        for (int i = 0; i< length; i++){
            System.out.printf(" " + arrayRandom[i]);
        }

        int length1;

        System.out.println("\nEnter the length of the array2: ");
        length1 = scanner.nextInt();

        int [] arrayRandom1 = new int[length1];

        System.out.println("Array2 is created: ");
        for (int i = 0; i< length1; i++){
            arrayRandom1[i] = (int) Math.floor(Math.random()*20 + 10);
        }

        for (int i = 0; i< length1; i++){
            System.out.printf(" " + arrayRandom1[i]);
        }

        int length2 = length + length1;
        int [] arrMerge = new  int[length2];

        int i = 0;
        while (i < length){
            arrMerge [i] = arrayRandom[i];
            i++;
        }

        int j = 0;
        while (j < length1){
            arrMerge [j + i] = arrayRandom1[j];
            j++;
        }

        System.out.println("\nArray3 is created: ");
        for (int k = 0; k< length2; k++){
            System.out.printf(" " + arrMerge[k]);
        }
    }
}
