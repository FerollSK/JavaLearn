package Level_2.Massive_massive;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true){
            System.out.print("Введите четное число n: ");
            int x = scanner.nextInt();
            if (x > 0){
                n = x;
                break;
            } else {
                System.out.println("Введите положительное число: ");
            }
        }
        int count = 0;
        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i*i-j*j)/n);
                if (matrix[i][j] > 0){
                    count++;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " : ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
