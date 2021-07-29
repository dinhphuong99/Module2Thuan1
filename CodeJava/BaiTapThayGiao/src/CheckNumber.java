import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        int max, min, check;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Nhập số 1 để tiếp tục");
            check = scanner.nextInt();

            if (check == 1) {
                do {
                    System.out.printf("Nhập min: ");
                    min = scanner.nextInt();
                } while (min < 0);

                do {
                    System.out.printf("Nhập max: ");
                    max = scanner.nextInt();
                } while (max < min);

                for (int i = min; i < max; i++) {
                    if (i % 3 == 0 && i % 6 != 0) {
                        System.out.printf(String.valueOf(i + " "));
                    }
                }
            }
        } while (check == 1);

    }

}
