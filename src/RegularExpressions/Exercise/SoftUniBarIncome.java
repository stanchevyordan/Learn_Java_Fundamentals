package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<customerName>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|\\$%\\.]*\\|(?<count>[0-9]+)\\|[^\\|\\$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        double totalIncome = 0;

        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {

                String customerName = matcher.group("customerName");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = count * Double.parseDouble(matcher.group("price"));

                System.out.printf("%s: %s - %.2f%n", customerName, product, price);

                totalIncome += price;

            }

            input = scanner.nextLine();

        }

        System.out.printf("Total income: %.2f%n", totalIncome);

    }
}