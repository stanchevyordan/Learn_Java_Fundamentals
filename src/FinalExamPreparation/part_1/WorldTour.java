package FinalExamPreparation.part_1;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.next();

        while(true) {
            String line = scanner.nextLine();
            if (line.equals("Travel")) {
                break;
            }

            String[] commandParts = line.split(":");
            String command = commandParts[0];

            switch(command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String stop = commandParts[2];

                    if (isValidIdx(index, stops)){
                        String left = stops.substring(0,index);
                        String right = stops.substring(index);

                        stops = left + stop + right;
                    }
                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if (isValidIdx(startIndex, stops) && isValidIdx(endIndex, stops)){
                        String left = stops.substring(0,startIndex);
                        String right = stops.substring(endIndex + 1);

                        stops = left + right;
                    }

                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];

                    stops = stops.replace(oldString, newString);
                    break;


            }

            System.out.println(stops);
        }

        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);

    }

    private static boolean isValidIdx(int index, String str) {
        return index >= 0 && index <= str.length();
    }

}
