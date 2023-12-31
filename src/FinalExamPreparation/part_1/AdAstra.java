package FinalExamPreparation.part_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(#|\\|)(?<foodName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        //StringBuilder foodsOutput = new StringBuilder();
        List<String> foodsOutput = new ArrayList<>();

        int totalCalories = 0;

        while (matcher.find()) {
            String typeFood = matcher.group("foodName");
            String expiration = matcher.group("expirationDate");
            int kcal = Integer.parseInt(matcher.group("calories"));

            totalCalories += kcal;
            String output = String.format("Item: %s, Best before: %s, Nutrition: %d", typeFood, expiration, kcal);
            foodsOutput.add(output);
            //foodsOutput.append(output);
        }
        int days =  totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        //System.out.println(foodsOutput);
        for (String line : foodsOutput) {
            System.out.println(line);
        }
    }
}
