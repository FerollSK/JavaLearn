package Level_2.Massive_massive;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 50.0 - 20);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " : ");
            }
            System.out.println();
        }
        int n = 0;
        int m = 0;
        while (true){
            System.out.print("Введите номер первого столбца: ");
            int x = scanner.nextInt();
            if (x > 0){
                n = x;
            } else {
                System.out.println("Введите положительное число: ");
            }
            System.out.print("Введите номер второго столбца: ");
            int y = scanner.nextInt();
            if (y > 0){
                m = y;
                break;
            } else {
                System.out.println("Введите положительное число: ");
            }
        }
        int k;
        for (int i = 0; i < matrix.length; i++) {
            k = matrix[i][n - 1];
            matrix[i][n - 1] = matrix[i][m - 1];
            matrix[i][m - 1] = k;
            }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " : ");
            }
            System.out.println();
        }
    }
}
