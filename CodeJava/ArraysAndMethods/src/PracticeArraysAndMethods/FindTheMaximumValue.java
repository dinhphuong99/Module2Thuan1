package PracticeArraysAndMethods;

import java.util.Scanner;

public class FindTheMaximumValue {
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


        int max = arrayRandom[0];

        for (int i = 1; i< length; i++){
            if(arrayRandom[i] > max){
                max = arrayRandom[i];
            }
        }

        System.out.println("The largest number in the array is:" + max);
    }
}
