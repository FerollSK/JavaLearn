package Level_2.Decomposition;

import javax.print.attribute.SupportedValuesAttribute;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println(number(9547));
    }

    private static int[] massive(int a) {
        int x = number(a);
        int[]
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
