package Exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter class: ");
        String classes = scanner.nextLine();

        student.display();
    }
}
