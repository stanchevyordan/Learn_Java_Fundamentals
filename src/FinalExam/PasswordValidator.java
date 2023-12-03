package FinalExam;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String commands = scanner.nextLine();
        while (!commands.equals("Complete")) {
            String[] asd = commands.split(" ");
            String command = asd[0];

            if (command.equals("Insert")) {
                char character = asd[2].charAt(0);
                int n = Integer.parseInt(asd[1]);
                if (n < password.length()) {
                    password = password.substring(0, n) + character + password.substring(n);
                    System.out.println(password);
                } else {
                    // Handle the case when n is greater than or equal to the length of the password
                    // You can choose to print an error message or handle it as per your requirements
                }
            } else if (command.equals("Make")) {
                String subCommand = asd[1];
                int n = Integer.parseInt(asd[2]);

                if (subCommand.equals("Upper")) {
                    password = password.substring(0, n) + Character.toUpperCase(password.charAt(n)) + password.substring(n + 1);
                    System.out.println(password);
                } else if (subCommand.equals("Lower")) {
                    password = password.substring(0, n) + Character.toLowerCase(password.charAt(n)) + password.substring(n + 1);
                    System.out.println(password);
                }
            } else if (command.equals("Replace")) {
                char character = asd[1].charAt(0);
                int n = Integer.parseInt(asd[2]);

                if (password.contains(String.valueOf(character))) {
                    int sum = (int) password.charAt(password.indexOf(character)) + n;
                    char newChar = (char) sum;
                    password = password.replace(character, newChar);
                    System.out.println(password);
                } else {
                    // Handle the case when the character is not present in the password
                    // You can choose to print an error message or handle it as per your requirements
                }
            } else if (command.equals("Validation")) {
                if (password.length() < 8) {
                    System.out.println("Password must be at least 8 characters long");
                } else if (!password.matches("[a-zA-Z0-9_!\"]+")) {
                    System.out.println("Password must consist only of letters, digits, and _!\"");
                } else if (!password.matches(".*[A-Z].*")) {
                    System.out.println("Password must consist at least one uppercase letter!");
                } else if (!password.matches(".*[a-z].*")) {
                    System.out.println("Password must consist at least one lowercase letter!");
                } else if (!password.matches(".*\\d.*")) {
                    System.out.println("Password must consist at least one digit!");
                }
            }

            commands = scanner.nextLine();
        }

        scanner.close();
    }
}
