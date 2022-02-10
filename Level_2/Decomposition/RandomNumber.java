package Level_2.Decomposition;

import java.util.Scanner;

public class RandomNumber {
    public static int number() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число': ");
            int n = scanner.nextInt();
            scanner.close();
            return n;
        }
    }

    public static int randomNumber() {
        int number = (int) (Math.random() * 30 - 15);
        return number;
    }

    public static int randomNumerator() {
        int number = (int) (Math.random() * 30 - 15);
        return number;
    }

    public static int randomDenominator() {
        int number = (int) (Math.abs(Math.random() * 30 - 15));
        return number;
    }
}
