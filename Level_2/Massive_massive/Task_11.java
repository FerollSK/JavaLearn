package Level_2.Massive_massive;

public class Task_11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
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
        int count = 0;
        int row;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5){
                    count++;
                }
            }
            if(count >= 3){
                System.out.println(i + 1);
            }
            count = 0;
        }
    }
}
