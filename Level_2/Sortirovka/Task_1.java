package Level_2.Sortirovka;

public class Task_1 {
    public static void main(String[] args) {
        int[] one = new int[7];
        int[] two = new int[5];
        for (int i = 0; i < one.length; i++) {
            one[i] = (int) (Math.random() * 40.0 - 10);
        }
        for (int i = 0; i < two.length; i++) {
            two[i] = (int) (Math.random() * 40.0 - 10);
        }
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + " : ");
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i] + " : ");
        }
        System.out.println();
        int[] general = new int[one.length + two.length];
        int k = 3;
        for (int i = 0; i < one.length; i++) {
            if (i <= k - 1){
                general[i] = one[i];
            } else if (i > k -1){
                general[i + two.length] = one[i];
            }
        }
        for (int i = 0; i < two.length; i++) {
            general[i + k] = two[i];
        }
        for (int i = 0; i < general.length; i++) {
            System.out.print(general[i] + " : ");
        }
    }
}
