package Level_2.Sortirovka;

public class Task_2 {
    public static void main(String[] args) {
        int[] one = new int[9];
        int[] two = new int[8];
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

        int[] general = new int[one.length + two.length];

        for (int i = 0; i < one.length; i++) {
            general[i] = one[i];
        }
         for (int i = one.length; i < general.length; i++) {
                    general[i] = two[i - one.length];                
             }

        for (int i = general.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if( general[j] > general[j+1] ){
                    int tmp = general[j];
                    general[j] = general[j+1];
                    general[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < general.length; i++) {
            System.out.print(general[i] + " : ");
        }
    }
}
