package Level_2.Decomposition;

public class Task_14 {
    public static void main(String[] args) {
        int a = 1;
        int b = 234572345;

        allNumbersArmstrong(a, b);

    }

    //Вывод на экран всех чисел Армстронга в заданном диапазоне
    private static void allNumbersArmstrong(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (armstrong(i) == true) {
                System.out.println(i);
            }
        }
    }

    //Проверка, является ли число числом Армстронга
    private static boolean armstrong(int a) {
        if (sumNumbers(a) == a) {
            return true;
        } else {
            return false;
        }
    }

    //Сумма цифр, возведенных в степень количества цифр числа
    private static int sumNumbers(int a) {
        int sum = 0;
        int n = number(a);
        while (a > 0) {
            sum += Math.pow(a % 10, n);
            a /= 10;
        }
        return sum;
    }

    //Нахождение количества цифр в числе
    private static int number(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

}
