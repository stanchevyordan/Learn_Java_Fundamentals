package MidExamRetake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpiceShelf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> spices = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("done")) {

            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];


            switch(commandName) {

                case "AddSpice":
                    String spice = commandParts[1];
                    if (!spices.contains(spice)) {
                        spices.add(spice);
                    }
                    break;


                case "AddManySpices":
                    int index = Integer.parseInt(commandParts[1]);
                    String[] spicesToAdd = commandParts[2].split("\\|");
                    spices.addAll(index, Arrays.asList(spicesToAdd));

                    break;


                case "SwapSpices":
                    String spice1 = commandParts[1];
                    String spice2 = commandParts[2];
                    if (spices.contains(spice1) && spices.contains(spice2)) {
                        int index1 = spices.indexOf(spice1);
                        int index2 = spices.indexOf(spice2);
                        swapSpices(spices, index1, index2);
                    }
                    break;


                case "ThrowAwaySpices":
                    String spiceToRemove = commandParts[1];
                    int numToRemove = Integer.parseInt(commandParts[2]);
                    if (spices.contains(spiceToRemove)) {
                        int startIndex = spices.indexOf(spiceToRemove);
                        int endIndex = Math.min(startIndex + numToRemove, spices.size());
                        spices.subList(startIndex, endIndex).clear();
                    }
                    break;


                case "Arrange":
                    spices.sort(String::compareTo);
                    break;
            }

            command = scanner.nextLine();

        }

        System.out.println(String.join(" ", spices));


    }

    private static void swapSpices(List<String> spices, int index1, int index2) {
        String temp = spices.get(index1);
        spices.set(index1, spices.get(index2));
        spices.set(index2, temp);
    }
}
