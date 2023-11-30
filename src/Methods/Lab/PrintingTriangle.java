package Methods.Lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        figure(number);
    }

    public static void figure (int number) {
        for (int i = 1; i <= number; i++) {
            printing(i);
        }

        for (int i = number - 1;  i >= 1 ; i--) {
            printing(i);
        }
    }


    public static void printing (int elementsCount) {
        for (int i = 1; i <= elementsCount ; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println();
    }

}
