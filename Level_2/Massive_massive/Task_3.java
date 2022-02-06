package Level_2.Massive_massive;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int colums = scanner.nextInt();

        int[][] matrix = new int[rows][colums];

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
        System.out.println();

        while (true) {
            System.out.println("Какую строку вывести: ");
            int k = scanner.nextInt();
            if (k <= matrix.length) {
                for (int i = 0; i < matrix[0].length; i++) {
                    System.out.print(matrix[k - 1][i] + " : ");
                }
                System.out.println();
                break;
            } else {
                System.out.println("Количество строк матрицы меньше указанного числа. Введите другой номер строки: ");
            }
        }
        while (true) {
            System.out.print("Какой столбец вывести: ");
            int p = scanner.nextInt();
            if (p <= matrix[0].length) {
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(matrix[i][p - 1]);
                }
                break;
            } else {
                System.out.println("Количество столбцов матрицы меньше указанного числа. Введите другой номер столбца: ");
            }
        }
    }
}
