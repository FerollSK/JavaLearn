package Level_2.Decomposition;

import java.util.Arrays;


public class Task_10 {
    public static void main(String[] args) {
        int a = 23418;
        System.out.println(Arrays.toString(massive(a)));
    }

    private static int[] massive(int a) {
        int x = number(a);
        int[] mas = new int[x];
        for (int i = x -1; i >= 0; i--) {
            mas[i] = a % 10;
            a /= 10;
        }
        return mas;
    }

    private static int number(int n){
        int count = 1;
        while (n / 10 > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
}
