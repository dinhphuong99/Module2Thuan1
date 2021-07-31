package PracticeArraysAndMethods;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMinMethod {
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

        System.out.println("\nMin value is: " + minValue(arrayRandom));
    }

    public static int minValue (int [] arr) {
        int min = arr[0];
        for (int i: arr) {
            if(i < min)
                min = i;
        }
        return min;
    }
}
