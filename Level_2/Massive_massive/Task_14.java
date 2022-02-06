package Level_2.Massive_massive;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int colums = scanner.nextInt();

        int[][] matrix = new int[rows][colums];

        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = n; j < matrix[i].length; j++) {
               matrix[i][j]=1;
            }
            n++;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " : ");
            }
            System.out.println();
        }
    }
}
