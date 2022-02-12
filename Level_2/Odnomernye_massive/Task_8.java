package Level_2.Odnomernye_massive;

public class Task_8 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 41.0 - 20);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " : ");
        }
        System.out.println();
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > min) {
                count++;
                ;
            }
        }
        int[] massive = new int[count];
        int n = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != min) {
                massive[n] = numbers[i];
                n++;
            }
        }
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " : ");
        }
    }
}
