package BasicSyntaxConditionalStatement;

import java.util.Scanner;

public class ScannerSumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= times; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
