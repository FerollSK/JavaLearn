package Level_2.Massive_massive;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true){
            System.out.print("Введите четное число n: ");
            int x = scanner.nextInt();
            if (x % 2 == 0){
                n = x;
                break;
            } else {
                System.out.println("Число нечетное, введите четное: ");
            }
        }
        int count = n;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < count; j++){
                    matrix[i][j] = i + 1;
            }
            count--;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " : ");
            }
            System.out.println();
        }
    }
}
