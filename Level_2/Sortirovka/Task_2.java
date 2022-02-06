package Level_2.Sortirovka;

public class Task_2 {
    public static void main(String[] args) {
        int[] one = new int[7];
        int[] two = new int[7];
        for (int i = 1; i < one.length + 1; i++) {
            one[i - 1] = (int)(i * 2.5);
        }
        for (int i = 2; i < two.length + 2; i++) {
            two[i - 2] = (int)(i * 2.6);
        }
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + " : ");
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i] + " : ");
        }
        System.out.println();
        int m = 0;
        int n = 0;
        int[] general = new int[one.length + two.length];
        for (int i = 0; i < one.length; i++) {
            general[i] = one[i];
        }
         for (int i = 0; i < general.length; i++) {
             for (int j = 0; j < two.length; j++) {
                if (two[i] <= general[i]){
                    for (int k = general.length; k >= n; k--) {
                    }
                    general[i] = two[j];
                    n++;
                } else {
                   general[i] = two[j];
                   n++;
                }
                
             }
         }
        for (int i = 0; i < general.length; i++) {
            System.out.print(general[i]+ " : ");
        }
    }
}
