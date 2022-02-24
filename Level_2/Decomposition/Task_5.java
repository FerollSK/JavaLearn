package Level_2.Decomposition;


public class Task_5 {
    public static void main(String[] args){
        int[] massive = RandomMassive.randoMassive(6);

        clesort(massive);
        int preMax = massive[1];
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " : ");
        }
        System.out.println();
        System.out.println("Второе по величине число: " + preMax);

    }

    private static int[] clesort(int[] massive){
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
        return massive;
    }
}
