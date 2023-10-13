package Arrays;

import java.util.Scanner;

public class ArrExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, -3, 5, 7};

        int sum = 0;
        int product = 1;
        double average;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
            
        }

    }
}

