package Level_2.Odnomernye_massive;

public class Task_1 {
    public static void main(String[] args) {
        int[] mas = {1, 3, 5, 34, 345, 44, 26, 76, 83, 10};
        int sum = 0;
        int k = 4;
        for (int i = 0; i < mas.length; i++){
            if (mas[i] % k == 0){
                sum =sum + mas[i];
            }
        }
        System.out.println(sum);
    }
}
