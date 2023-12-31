package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split( " "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            }
            else {
                oddSum += number;
            }
        }

        System.out.println(evenSum - oddSum);

    }
}
