package ExerciseArrayAndMethods;

import java.util.Scanner;

public class AddElementToArray {
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

        while (true){
            System.out.println("\nEnter element to add: ");
            int element = scanner.nextInt();

            int location;
            while (true){
                System.out.println("Enter location to add: ");
                location = scanner.nextInt();
                if (location >=0 && location < length)
                    break;
            }

            for (int i = length -1; i >= location; i--) {
                if (i == location){
                    arrayRandom[i] = element;
                }else
                    arrayRandom[i] = arrayRandom[i -1];
            }

            for (int i = 0; i< length; i++){
                System.out.printf(" " + arrayRandom[i]);
            }

            break;
        }
    }
}
