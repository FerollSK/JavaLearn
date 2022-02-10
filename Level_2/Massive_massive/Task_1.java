package Level_2.Massive_massive;

public class Task_1 {
    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 40.0 - 10);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " : ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                    if (matrix[0][j] > matrix[matrix.length - 1][j]){
                        System.out.print(matrix[i][j] + " : ");
                    }
            }
            System.out.println();
        }
    }
}