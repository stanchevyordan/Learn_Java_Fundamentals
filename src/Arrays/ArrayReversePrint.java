package Arrays;

import java.util.Scanner;

public class ArrayReversePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.println(numbers[i] + " ");
        }

    }
}
