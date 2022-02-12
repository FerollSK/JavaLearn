package Level_2.Decomposition;

public class Task_17 {
    public static void main(String[] args) {
        int n = 2823;
        System.out.println(kolvoOperations(n));
    }

    private static int kolvoOperations(int a) {
        int count = 0;
        while (a > 0) {
            if (a - summaChisel(a) < 0) {
                count++;
                break;
            } else {
                count++;
                a = a - summaChisel(a);
            }
        }
        return count;
    }

    private static int summaChisel(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
