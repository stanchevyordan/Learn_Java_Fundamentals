package Arrays;

import java.util.Scanner;

public class ArrayStringsReversePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[] numbers = new String[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextLine();
        }

        for (int i = numbers.length; i >= 0 ; i--) {
            System.out.println(numbers[i] + "");
        }

    }
}