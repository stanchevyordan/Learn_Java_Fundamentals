package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[countWagons];
        for (int i = 0; i < countWagons; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            wagons[i] = people;
        }

        int sum = 0;
        for (int number : wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);

    }
}