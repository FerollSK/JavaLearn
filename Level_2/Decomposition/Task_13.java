package Level_2.Decomposition;

public class Task_13 {
    public static void main(String[] args) {
        int a = 4;
        int b = 2 * a;
        bliznecy(a, b);
    }    

    private static void bliznecy(int a, int b){
        for (int i = a; i <= b; i++) {
            if (proverka(i, b) == true){
                System.out.println(i + " и " + (i + 2));
            }
        }
    }

    private static boolean proverka(int a, int b){
        if (a + 2 <= b){
            return true;
        } else {
            return false;
        }
    }
}
