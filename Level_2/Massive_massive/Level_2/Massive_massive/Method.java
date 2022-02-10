package Level_2.Massive_massive.Level_2.Massive_massive;

import java.util.Scanner;

public class Method {
    public static int[] oneMassiveRandom() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите количество элементов массива n: ");
            int x = scanner.nextInt();
            if (x > 0) {
                int[] massive = new int[x];
                for (int i = 0; i < massive.length; i++) {
                    massive[i] = (int) (Math.random() * 30.0 - 15);
                }
                scanner.close();
                return massive;
            } else if (x == 0) {
                System.out.println("Вы ввели число 0, введите другое число: ");
            } else {
                System.out.println("Вы ввели отрицатетльное число, введите другое число: ");
            }
        }
    }
}
