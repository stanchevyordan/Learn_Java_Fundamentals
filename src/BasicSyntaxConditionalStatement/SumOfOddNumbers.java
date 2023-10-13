package BasicSyntaxConditionalStatement;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int oddNumber = 2 * i - 1;
            sum += oddNumber;
            System.out.println(oddNumber);
            if (oddNumber >= number) {
                break;
            }
        }
        System.out.println(sum);
    }
}

