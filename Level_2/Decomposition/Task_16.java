package Level_2.Decomposition;

public class Task_16 {
    public static void main(String[] args) {
        int n = 4;
        int a = allNumbers(n);
        System.out.println(a);
        System.out.println(chetnyeChisla(a));
    }

    // Определение количества четных цифр в сумме
    public static int chetnyeChisla(int a) {
        int count = 0;
        while (a > 0) {
            if (a % 2 == 0) {
                count++;
                a /= 10;
            } else {
                a /= 10;
            }
        }
        return count;
    }

    // Считаем сумму чисел
    private static int allNumbers(int n) {
        int b = (int) Math.pow(10, n - 1);
        int c = (int) Math.pow(10, n) - 1;
        int sum = 0;
        for (int i = b; i < c; i++) {
            if (number(i) == true) {
                sum += i;
            }
        }
        return sum;
    }

    // Проверяем состоит ли число только из нечетных цифр
    private static boolean number(int a) {
        int count = 0;
        while (a > 0) {
            if (a % 2 == 0) {
                count++;
                break;
            } else {
                a /= 10;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}
