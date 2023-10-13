package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        String[] names = new String[n];

        System.out.println(Arrays.toString(names));
    }
}
