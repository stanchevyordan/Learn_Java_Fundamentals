package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);

    }

    public static void printMiddleCharacter (String text1) {
        int length = text1.length();

        if (length % 2 != 0) {
            int indexOfMiddleCharacter = length / 2;
            System.out.println(text1.charAt(indexOfMiddleCharacter));
        }
        else {
            int indexFirstMiddleCharacter = length / 2 - 1;
            int indexSecondMiddleCharacter = length / 2;
            System.out.printf("%c", text1.charAt(indexFirstMiddleCharacter));
            System.out.printf("%c", text1.charAt(indexSecondMiddleCharacter));
        }
    }
}
