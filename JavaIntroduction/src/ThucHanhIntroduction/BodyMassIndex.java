package ThucHanhIntroduction;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        System.out.printf("Input height (m): ");
        Scanner scanner = new Scanner(System.in);
        float height = scanner.nextFloat();
        System.out.printf("Input weight (kg): ");
        float weight = scanner.nextFloat();

        float bmi = (float) (weight / Math.pow(height, 2));

        System.out.println(String.valueOf(bmi));

        if (bmi < 18.5) {
            System.out.printf("Under weight");
        } else if ( bmi >= 30) {
            System.out.printf("Oberse");
        } else if ( bmi >= 18.5 && bmi > 25) {
            System.out.printf("Normal");
        } else if ( bmi >= 25 && bmi < 30) {
            System.out.printf("Over weight");
        } else {
            throw new IllegalStateException("Unexpected value: " + bmi);
        }
    }
}
