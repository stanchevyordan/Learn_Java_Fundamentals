package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, String> parkingData = new LinkedHashMap<>();

        int countCommands = Integer.parseInt(scanner.nextLine());



        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");

            String commandName = commandParts[0];
            String username = commandParts[1];

            switch(commandName){
                case "register":
                        String carNumber = commandParts[2];

                        if(parkingData.containsKey(username)){
                            System.out.printf("ERROR: already registered with plate number %s%n", parkingData.get(username));
                        }

                        else{
                            parkingData.put(username, carNumber);
                            System.out.printf("%s registered %s successfully%n", username, carNumber);
                        }
                    break;


                case "unregister":
                        if(!parkingData.containsKey(username)) {
                            System.out.printf("ERROR: user %s not found%n", username);
                        }
                        else {
                            parkingData.remove(username);
                            System.out.printf("%s unregistered successfully%n", username);
                        }
                    break;

            }
        }

        for (Map.Entry<String, String> entry : parkingData.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}