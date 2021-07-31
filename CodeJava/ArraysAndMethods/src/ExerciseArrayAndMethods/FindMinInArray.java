package ExerciseArrayAndMethods;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        length = scanner.nextInt();

        int [] arrayRandom = new int[length];

        System.out.println("Array is created: ");
        for (int i = 0; i< length; i++){
            arrayRandom[i] = (int) Math.floor(Math.random()*10 + 1);
        }

        for (int i = 0; i< length; i++){
            System.out.printf(" " + arrayRandom[i]);
        }

        int min = arrayRandom[0];
        for (int i: arrayRandom) {
            if(i < min)
                min = i;
        }

        System.out.println("\nMin value is: " + min);
    }
}
