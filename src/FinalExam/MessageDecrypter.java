package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String regex = "^([$%])([A-Z][a-z]{2,})\\1: \\[(\\d+)\\]\\|\\[(\\d+)\\]\\|\\[(\\d+)\\]\\|$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String inputMessage = scanner.nextLine();

            Matcher matcher = pattern.matcher(inputMessage);

            if (matcher.matches()) {
                String tag = matcher.group(2);
                char char1 = (char) Integer.parseInt(matcher.group(3));
                char char2 = (char) Integer.parseInt(matcher.group(4));
                char char3 = (char) Integer.parseInt(matcher.group(5));

                // Convert numbers to ASCII and concatenate them
                String decryptedMessage = String.format("%s: %c%c%c", tag, char1, char2, char3);
                System.out.println(decryptedMessage);
            } else {
                System.out.println("Valid message not found!");
            }
        }

        scanner.close();
    }
}
