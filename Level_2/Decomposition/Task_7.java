package Level_2.Decomposition;

public class Task_7 {
    public static void main(String[] args) {
        int a = 9;

        System.out.println(summa(a));

    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }

    private static int summa(int a){
        int sum = 0;
        for (int i = 1; i <= a; i+=2) {
            sum += factorial(i);
        }
        return sum;
    }
}
