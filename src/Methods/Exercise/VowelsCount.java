package Methods.Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine(); //"Desislava"

        printCountVowels(text);
    }


    public static void printCountVowels (String text1) {
        int count = 0;
        for (char letter : text1.toCharArray()) {

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                    || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                count++;
            }
        }

        System.out.println(count);
    }
}