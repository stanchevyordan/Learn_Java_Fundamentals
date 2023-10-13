package BasicSyntaxConditionalStatement;

import java.util.Scanner;

public class TheatherPromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        switch (typeOfDay) {
            case "Weekday":
                if ((0 <= age && age <= 18) || (64 < age && age <= 112)) {
                    price = 12;
                } else if (18 < age && age <= 64) {
                    price = 18;
                }
                break;

            case "Weekend":
                if ((0 <= age && age <= 18) || (64 < age && age <= 112)) {
                    price = 15;
                } else if (18 < age && age <= 64) {
                    price = 20;
                }
                break;

            case "Holiday":
                 if (0 < age && age <= 18) {
                    price = 5;
                } else if (18 < age && age <= 64) {
                    price = 12;
                } else if (64 < age && age <= 112) {
                    price = 10;
                }
                break;
        }


        System.out.println(price);

    }
}
