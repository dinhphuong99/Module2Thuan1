package ThucHanhIntroduction;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.printf("Nhập vào 3 hệ số của phương trình ax + b = 0:");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("a");
        float a = scanner.nextFloat();
        System.out.printf("b");
        float b = scanner.nextFloat();

        if (a==0){
            if (b==0){
                System.out.printf("Phương trình vô số nghiệm: ");
            }else if (b==0){
                System.out.printf("Phương trình vô nghiệm: ");
            }
        } else {
            System.out.printf("Phương trình có nghiệm: " + -b/a);
        }
    }
}
