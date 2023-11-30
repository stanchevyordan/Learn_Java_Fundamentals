package ClassesAndObjects.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RandomString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputWords = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> result = new ArrayList<>();

        Random rdm = new Random();

        int inputWordLen = inputWords.size();
        for (int i = 0; i < inputWordLen; i++) {
            int index = rdm.nextInt(inputWords.size());

            result.add(inputWords.get(index));
            inputWords.remove(index);
        }

        for (String word : result) {
            System.out.println(word);
        }

    }
}
