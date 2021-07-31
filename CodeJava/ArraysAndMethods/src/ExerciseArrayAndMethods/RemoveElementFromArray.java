package ExerciseArrayAndMethods;

import java.util.Scanner;

public class RemoveElementFromArray {
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
            System.out.println("\nEnter element to delete: ");
            int element = scanner.nextInt();

            for (int k = 0; k < length; k++) {
                if (element != arrayRandom[k] && k==length-1){
                    System.out.println("This element is not available");
                }else if (element == arrayRandom[k]){
                    for (int i = k; i < length; i++) {
                        if (i == length - 1)
                            arrayRandom[i] = 0;
                        else
                            arrayRandom[i] = arrayRandom[i+1];
                    }

                    for (int i = 0; i< length; i++){
                        System.out.printf(" " + arrayRandom[i]);
                    }

                    break;
                }
            }
        }
    }
}
