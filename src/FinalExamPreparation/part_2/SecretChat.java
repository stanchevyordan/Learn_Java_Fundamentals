package FinalExamPreparation.part_2;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder messageBuilder = new StringBuilder(message);
        String input = scanner.nextLine();


        while (!input.equals("Reveal")) {

            String[] parts = input.split(":\\|:");
            String command = parts[0];

            switch(command) {

                case "InsertSpace":

                    int index = Integer.parseInt(parts[1]);
                    messageBuilder.insert(index, " ");
                    System.out.println(messageBuilder);

                    break;

                case "Reverse":
                    String substring = parts[1];

                    if(messageBuilder.toString().contains(substring)) {
                        int indexOfSubstring = messageBuilder.indexOf(substring);
                        messageBuilder.delete(indexOfSubstring, messageBuilder.length());

                        String reversedSubstring = new StringBuilder(substring).reverse().toString();

                        messageBuilder.append(reversedSubstring);
                    }
                    else {
                        System.out.println("Error");
                    }

                    break;

                case "ChangeAll":

                    String textForReplace = parts[1];
                    String replacementText = parts[2];
                    messageBuilder = new StringBuilder(messageBuilder.toString().replaceAll(textForReplace,replacementText));
                    System.out.println(messageBuilder);

                    break;

            }

            input = scanner.nextLine();

        }

        System.out.println("You have a new text message: " + messageBuilder);

    }
}
