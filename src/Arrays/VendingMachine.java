package Arrays;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
            // Define the menu of drinks
        String[] menu = {
                    "Coke",
                    "Pepsi",
                    "Sprite",
                    "Water",
                    "Iced Tea"
        };

        // Display the menu to the customer
        System.out.println("Vending Machine Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }

        // Take the customer's choice as an integer input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of your choice: ");
        int choice = scanner.nextInt();

        // Check if the choice is valid
        if (choice >= 1 && choice <= menu.length) {
                String selectedDrink = menu[choice - 1]; // Adjust for 0-based array indexing
                System.out.println("You have selected: " + selectedDrink);
                System.out.println("Enjoy your " + selectedDrink + "!");
        } else {
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }
}

