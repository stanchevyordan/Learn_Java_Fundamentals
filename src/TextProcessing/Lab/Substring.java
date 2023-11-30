package TextProcessing.Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();

        while(true) {
            boolean contains = text.contains(word);
            if(!contains){
                break;
            }

            text = text.replace(word, "");
        }

        System.out.println(text);

    }
}
