package Level_2.Decomposition;

public class Task_11 {
    public static void main(String[] args){
        long a = 2384723470948109345L;
        long b = 2389478927487482982L;

        twoNumbers(a, b);
    }

    private static void twoNumbers(long a, long b){
        int count1 = number(a);
        int count2 = number(b);
        if (count1 > count2){
            System.out.println("В первом числе больше цифр");
        } else if ( count1 < count2) {
            System.out.println("Во втором числе больше цифр");
        } else {
            System.out.println("В числах одинаковое количество цифр");
        }
    }

    private static int number(long a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }
}
