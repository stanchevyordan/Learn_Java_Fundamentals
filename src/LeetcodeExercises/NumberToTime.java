package LeetcodeExercises;

import java.util.Scanner;

public class NumberToTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int m = number % 60;
        int h = number / 60;
        while (h > 23) {
            h = h - 24;
        }

        System.out.printf("%02d:%02d",h , m);

    }
}

