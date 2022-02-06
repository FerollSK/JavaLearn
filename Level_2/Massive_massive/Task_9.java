package Level_2.Massive_massive;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int colums = scanner.nextInt();

        int[][] matrix = new int[rows][colums];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.abs(Math.random() * 50.0 - 20));
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " : ");
            }
            System.out.println();
        }
        System.out.println();
        int max = 0;
        int count = 0;
        int sum[] = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[j] += matrix[i][j];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > max){
                    max = sum[i];
                    count = i + 1;
            }
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " : ");
        }
        System.out.println();
        System.out.println(count);
    }
}
