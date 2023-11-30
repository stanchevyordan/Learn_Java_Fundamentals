package MiddleExamJavaFundamentals;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int citiesNumber = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;

        for (int i = 1; i <= citiesNumber; i++) {

            String nameCity = scanner.nextLine();
            double ownerIncome = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());


            double profit = 0;

            if (i % 3 == 0) {
                profit = ownerIncome - (ownerExpenses + ownerExpenses * 0.50);
                totalProfit += profit;

            }
            else if (i % 5 == 0) {
                profit = ownerIncome * 0.90 - ownerExpenses;
                totalProfit += profit;
            }

            else {
                profit = ownerIncome - ownerExpenses;
                totalProfit += profit;
            }

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", nameCity, profit);

        }

        System.out.printf("Burger Bus total profit: %.2f leva.%n", totalProfit);

    }
}
