package MidExamRetake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GeneratingNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial sequence of integers
        List<Integer> sequence = readSequence(scanner);

        // Process commands
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("END")) {
                break;
            }

            // Process the command using switch-case
            processCommand(sequence, command);
        }

        // Print the resulting elements
        System.out.println(joinList(", ", sequence));
    }

    private static List<Integer> readSequence(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> sequence = new ArrayList<>();
        for (String num : input) {
            sequence.add(Integer.parseInt(num));
        }
        return sequence;
    }

    private static void processCommand(List<Integer> sequence, String command) {
        String[] tokens = command.split("\\s+");

        switch (tokens[0]) {
            case "add":
                for (int i = tokens.length - 1; i >= 3; i--) {
                    sequence.add(0, Integer.parseInt(tokens[i]));
                }
                break;
            case "remove":
                if (tokens.length == 4 && tokens[2].equals("greater") && tokens[3].equals("than")) {
                    int threshold = Integer.parseInt(tokens[4]);
                    sequence.removeIf(element -> element > threshold);
                }
                break;
            case "replace":
                int valueToReplace = Integer.parseInt(tokens[1]);
                int replacementValue = Integer.parseInt(tokens[2]);
                for (int i = 0; i < sequence.size(); i++) {
                    if (sequence.get(i) == valueToReplace) {
                        sequence.set(i, replacementValue);
                    }
                }
                break;
            case "removeAt":
                int idx = Integer.parseInt(tokens[2]);
                if (idx >= 0 && idx < sequence.size()) {
                    sequence.remove(idx);
                }
                break;
            case "find":
                boolean isEven = tokens[1].equals("even");
                sequence.stream()
                        .filter(num -> isEven ? num % 2 == 0 : num % 2 != 0)
                        .forEach(num -> System.out.print(num + " "));
                System.out.println();
                break;
            default:
                // Handle unknown command
                System.out.println("Unknown command: " + command);
                break;
        }
    }

    private static String joinList(String delimiter, List<Integer> list) {
        return list.stream().map(Object::toString).collect(Collectors.joining(delimiter));
    }
}
