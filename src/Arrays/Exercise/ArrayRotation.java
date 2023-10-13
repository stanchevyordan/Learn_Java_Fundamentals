package Arrays.Exercise;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split( " "))
                .mapToInt(Integer::parseInt)
                .toArray();
                // 51 47 32 61 21

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotations; rotation++) {
            int firstElement = numbers[0]; //51
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length - 1] = firstElement;
        }

        for (int number : numbers) {
            System.out.printf(number + " ");
        }
    }
}
