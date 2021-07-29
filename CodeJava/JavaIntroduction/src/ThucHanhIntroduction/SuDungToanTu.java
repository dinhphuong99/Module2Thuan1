package ThucHanhIntroduction;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width;
        float height;

        System.out.printf("Enter width");
        width = scanner.nextFloat();
        System.out.printf("Enter height");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.printf("Area is:" + area);
    }
}
