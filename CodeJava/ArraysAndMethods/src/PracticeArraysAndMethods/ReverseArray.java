package PracticeArraysAndMethods;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        length = scanner.nextInt();

        int [] arrayRandom;
        int temp = 0;
        arrayRandom = new int[length];

        System.out.println("Array is created: ");
        for (int i = 0; i< length; i++){
            arrayRandom[i] = (int) Math.floor(Math.random()*10 + 1);
        }

        for (int i = 0; i< length; i++){
            System.out.printf(" " + arrayRandom[i]);
        }

        System.out.println("The array is reversed: ");
        for (int i = 0; i< length/2; i++){
            temp = arrayRandom[i];
            arrayRandom[i] = arrayRandom[length - i - 1];
            arrayRandom[length - i - 1] = temp;
        }

        for (int i = 0; i< length; i++){
            System.out.printf(" " + arrayRandom[i]);
        }
    }
}
