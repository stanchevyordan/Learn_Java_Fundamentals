package Arrays;

import java.util.Scanner;

public class randomArrayExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Fill an array with integers
        System.out.print("Enter the number of integers (between 1 and 20): ");
        int n = scanner.nextInt();
        if (n < 1 || n > 20) {
            System.out.println("Please enter a valid number of integers.");
            return;
        }

        int[] integerArray = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            integerArray[i] = scanner.nextInt();
        }

        System.out.println("You entered the following integers:");
        for (int num : integerArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Task 2: Fill an array with points
        System.out.print("Enter the number of points (between 1 and 20): ");
        n = scanner.nextInt();
        if (n < 1 || n > 20) {
            System.out.println("Please enter a valid number of points.");
            return;
        }

        Point[] pointArray = new Point[n];
        System.out.println("Enter " + n + " points (x y):");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            pointArray[i] = new Point(x, y);
        }

        System.out.println("You entered the following points:");
        for (Point point : pointArray) {
            System.out.println("(" + point.x + ", " + point.y + ")");
        }
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}