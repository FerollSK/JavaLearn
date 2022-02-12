package Level_2.Decomposition;

import java.util.Arrays;

public class Task_15 {
    public static void main(String[] args) {
        int n = 8273;
        allNumbers(n);
    }

    private static void allNumbers(int n) {
        int a = number(n) - 1;
        int b = (int) Math.pow(10, a);
        int c = (int) Math.pow(10, a + 1) - 1;
        for (int i = b; i < c; i++) {
            if (vozrostNumber(i) == true) {
                System.out.println(i);
            }
        }
    }

    // Проверка на возростание цифр в чиле
    private static boolean vozrostNumber(int a) {
        int n = number(a);
        int count = 0;
        int[] massive = new int[n];
        for (int i = massive.length - 1; i >= 0; i--) {
            massive[i] = a % 10; 
            a /= 10;
        }
        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i + 1] == massive[i] + 1){
                count ++;
            }
        }
        if (count == n - 1){
            return true;
        } else {
            return false;
        }
    }

    // Нахождение количества цифр в числе
    private static int number(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }
}
