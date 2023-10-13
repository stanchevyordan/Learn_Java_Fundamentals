package BasicSyntaxConditionalStatement;

import java.util.Scanner;

public class AnimalClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch (animal) {
            case "dog":
            case "cat":
            case "mouse":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "snake":
            case "lizard":
                System.out.println("reptile");
                break;
        }

    }
}
