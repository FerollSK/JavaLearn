package Level_2.Decomposition;

public class Nod {
    public static int nod(int c, int d){
        int a = Math.abs(c);
        int b = Math.abs(d);
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
