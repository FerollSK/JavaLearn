package Level_2.Massive_massive;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядок квадратной матрицы: ");
        int a = scanner.nextInt();

        int[][] matrix = new int[a][a];

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

        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][i] + " : ");
        }
        System.out.println();
        for (int i = matrix.length - 1; i >= 0; i--){
            System.out.print(matrix[i][matrix.length - i - 1] + " : ");
        }
        scanner.close();
    }
}
