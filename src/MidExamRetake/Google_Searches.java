package MidExamRetake;

import java.util.Scanner;

public class Google_Searches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        int users = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;

        for (int i = 1; i <= users; i++) {

            int searches = Integer.parseInt(scanner.nextLine());
            double moneyPerUser = 0;

            if (searches == 1) {
                continue;
            }

            else if (i % 3 == 0) {

                if (searches > 5) {
                    moneyPerUser = income * searches;
                    totalMoney += moneyPerUser * 6;
                }

                else {
                    moneyPerUser = income * searches;
                    totalMoney += moneyPerUser * 3;
                }

            }

            else if (searches > 5) {

                moneyPerUser = income * searches;
                totalMoney += moneyPerUser * 2;
            }

            else {
                moneyPerUser = income * searches;
                totalMoney += moneyPerUser;
            }

        }

        System.out.printf("Total money earned: %.2f", totalMoney);

    }
}
