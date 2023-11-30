package MiddleExamJavaFundamentals;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friendList = Arrays.stream(scanner.nextLine()
                        .split(","))
                        .collect(Collectors.toList());

        int blacklisted = 0;
        int lost = 0;

        String command = scanner.nextLine();
        while (!command.equals("Report")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0]; //"Urgent", "Unnecessary", "Correct", "Rearrange"
            String friend = commandParts[1];

            switch (commandName) {
                case "Blacklist":
                    String newFriend = "Blacklisted";
                    if (friendList.contains(friend)) {
                        int indexFriend = friendList.indexOf(friend);
                        friendList.remove(friend);
                        friendList.add(indexFriend, newFriend);
                        System.out.printf("%s was blacklisted.%n", friend);
                        blacklisted++;
                    }
                    else {
                        System.out.printf("%s was not found.%n", friend);
                    }
                    break;
                case "Error":
                    String newFriend1 = "Lost";
                    if (friendList.contains(friend)) {
                        int indexFriend = friendList.indexOf(friend);
                        friendList.set(indexFriend, newFriend1);
                        System.out.printf("%s was lost due to an error.%n", friend);
                        lost++;
                    } else {
                        System.out.printf("%s was not found.%n", friend);
                    }
                    break;
                case "Change":
                    String newName = commandParts[2];
                    if (friendList.contains(friend)) {
                        int indexFriend = friendList.indexOf(friend);
                        friendList.remove(friend);
                        friendList.add(indexFriend, newName);

                    }
                    break;
            }


            command = scanner.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n", blacklisted);
        System.out.printf("Lost names: %d%n", lost);
        System.out.println(friendList.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));


    }
}
