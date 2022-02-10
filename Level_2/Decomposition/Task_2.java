package Level_2.Decomposition;

public class Task_2 {
    public static void main(String[] args) {

        int a = RandomNumber.number();
        int[] matrix = RandomMatrix.randoMatrix(a);

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " : ");
        }
        System.out.println();

        int gcd = matrix[0];

        for (int i = 1; i < matrix.length; i++) {
            gcd = getGcd(gcd, matrix[i]);
        }
        System.out.println(gcd);
    }

    private static int getGcd(int c, int d) {
        int a = Math.abs(c);
        int b = Math.abs(d);
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}
