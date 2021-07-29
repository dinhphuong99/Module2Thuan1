package BaiTapIntroduction;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Enter USD amount: ");
        Scanner scanner = new Scanner(System.in);

        float amountOfMoney = scanner.nextFloat();
        System.out.printf("VND amount is " + amountOfMoney*23000);
    }
}
