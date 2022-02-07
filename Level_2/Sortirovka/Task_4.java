package Level_2.Sortirovka;

import java.util.Arrays;

public class Task_4 {
    public static void main (String[] args){
    int[] massive = {1, 3, 4, 7, 9, 11, 14, 17};  
    boolean isSorted = false;
    int n;
    while (!isSorted){
        isSorted = true;
        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i] < massive[i + 1]){
                isSorted = false;

                n = massive[i];
                massive[i] = massive[i + 1];
                massive[i + 1] = n;
            }
        }
    }
    System.out.println(Arrays.toString(massive));
    }
}
