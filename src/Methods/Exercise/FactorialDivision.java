package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long number1 = factorial(firstNumber);

        long number2 = factorial(secondNumber);

        double divided = number1 * 1.0 / number2;

        System.out.printf("%.2f", divided);

    }

    public static long factorial (int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

}
