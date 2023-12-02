package FinalExamPreparation.part_1;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        String input = scanner.nextLine();

        while (!input.equals("Done")) {

            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch(command) {

                case "TakeOdd":

                    StringBuilder passwordChange = new StringBuilder();
                    for (int i = 1; i <= password.length(); i += 2) {
                        passwordChange.append(password.charAt(i));
                    }
                    password = passwordChange.toString();
                    System.out.println(password);

                    break;

                case "Cut":
                    int start = Integer.parseInt(commandParts[1]);
                    int end = start + Integer.parseInt(commandParts[2]);
                    password = new StringBuilder(password)
                            .delete(start, end).toString();
                    System.out.println(password);
                    break;

                case "Substitute":
                    String target = commandParts[1];
                    String replacement = commandParts[2];
                    if (password.contains(target)) {
                        password = password.replace(target, replacement);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);
    }
}
