package Level_2.Decomposition;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        int numb = 38567483;
        System.out.println(Arrays.toString(massive(numb)));
    }

    private static int[] massive(int number) {
        int n = number(number);
        int[] massive = new int[n];
        for (int i = 0; i < massive.length; i++) {
            massive[massive.length - i - 1] = number % 10;
            number /= 10;
        }
        return massive;
    }

    private static int number(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }
}
