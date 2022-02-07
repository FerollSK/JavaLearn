package Level_2.Sortirovka;

public class Task_3 {
    public static void main(String[] args) {
        int[] mass = Methods.oneMassiveRandom();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " : ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            int min = mass[i];
            int minId = i;
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] > min) {
                    min = mass[j];
                    minId = j;
                }
            }
            int temp = mass[i];
            mass[i] = min;
            mass[minId] = temp;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " : ");
        }
    }
}
