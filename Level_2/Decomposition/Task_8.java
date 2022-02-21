package Level_2.Decomposition;

public class Task_8 {
    public static void main(String[] args){
        //int[] massive = RandomMassive.randoMassive(10);
        int[] massive = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum1 = sum(massive, 1, 3);
        int sum2 = sum(massive, 3, 5);
        int sum3 = sum(massive, 4, 6);    
        
        System.out.println(sum1 + " : " + sum2 + " : " + sum3);

    }

    private static int sum(int[] massive, int k, int m){
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += massive[i-1];
        }
        return sum;
    }
}
