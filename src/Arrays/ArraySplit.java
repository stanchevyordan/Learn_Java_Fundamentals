package Arrays;

import java.util.Scanner;

public class ArraySplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = "1 2 21 15";
        String[] items = values.split(" ");
        int[] arr = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            arr[i] = Integer.parseInt(items[i]);
            System.out.println(arr[i]);
        }
    }
}
