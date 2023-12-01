package FinalExamPreparation.part_2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, int[]> piratesInfo = new LinkedHashMap<>();

        String text = scanner.nextLine();

        while(!text.equals("Sail")) {
            String[] commandParts = text.split("\\|\\|");
            String town = commandParts[0];

            int population = Integer.parseInt(commandParts[1]);
            int gold = Integer.parseInt(commandParts[2]);

            piratesInfo.putIfAbsent(town, new int[2]);
            piratesInfo.get(town)[0] += population;
            piratesInfo.get(town)[1] += gold;

            text = scanner.nextLine();

        }

        text = scanner.nextLine();

        while (!text.equals("End")) {

            String[] commandParts = text.split("=>");


            if (commandParts[0].equals("Plunder")){
                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", commandParts[1],
                        Integer.parseInt(commandParts[3]), Integer.parseInt(commandParts[2]));
                piratesInfo.get(commandParts[1])[0] -= Integer.parseInt(commandParts[2]);
                piratesInfo.get(commandParts[1])[1] -= Integer.parseInt(commandParts[3]);

                if (piratesInfo.get(commandParts[1])[0] == 0 || piratesInfo.get(commandParts[1])[1] == 0) {
                    piratesInfo.remove(commandParts[1]);
                    System.out.printf("%s has been wiped off the map!%n", commandParts[1]);
                }
            }

            else if (commandParts[0].equals("Prosper")) {

                if(Integer.parseInt(commandParts[2]) < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                }

                else {
                    piratesInfo.get(commandParts[1])[1] += Integer.parseInt(commandParts[2]);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.", Integer.parseInt(commandParts[2]),
                            commandParts[1], piratesInfo.get(commandParts[1])[1]);
                }


            }

            text = scanner.nextLine();
        }

        if (piratesInfo.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

        else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:", piratesInfo.size());
            piratesInfo.entrySet().stream().forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                    e.getKey(), e.getValue()[0], e.getValue()[1]));
        }

    }
}