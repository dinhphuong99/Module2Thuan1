package ExerciseArrayAndMethods;

import java.util.Scanner;

public class NumberOfTheCurrentExportOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("\nEnter the chacracter you want to find:");
        char c;
        c = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println("This character appears " + count + " times");
    }
}
