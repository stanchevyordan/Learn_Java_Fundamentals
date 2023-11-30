package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(a -> Integer.parseInt(a))
                .filter(n -> n > 0)
                .map(e -> e * -1)
                .toArray();

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
