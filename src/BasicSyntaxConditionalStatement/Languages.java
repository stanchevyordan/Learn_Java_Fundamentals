package BasicSyntaxConditionalStatement;

import java.util.Scanner;

public class Languages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter country: ");
        String country = scanner.nextLine();

        switch(country) {
            case "England":
                System.out.println("English");
                break;
            case "Russia":
                System.out.println("Russian");
                break;
            case "Bulgaria":
                System.out.println("Bulgarian");
                break;
            case "France":
                System.out.println("French");
                break;
            case "India":
                System.out.println("Hindi");
                break;
            case "Israel":
                System.out.println("Hebrew");
                break;

            }
    }
}
