package BasicSyntaxConditionalStatement;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        m = m + 30;

        if(m >= 60) {
            m = m - 60;
            h++;
        }

        if(h > 23) {
            h = 0;
        }

        System.out.printf("%d:%02d", h, m);

    }
}
