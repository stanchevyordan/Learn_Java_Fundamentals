package BasicSyntaxConditionalStatement;

import java.util.Scanner;

public class MultiplicationTable_DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplication = Integer.parseInt(scanner.nextLine());
        do {
            int result;
            result = number * multiplication;
            System.out.printf("%d X %d = %d%n", number, multiplication, result);
            multiplication++;
        }while (multiplication <= 10);

    }
}
