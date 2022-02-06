package Level_2.Odnomernye_massive;

public class Task_9 {
    public static void main(String[] args) {
        int[] numbers = {4, -15, -2, 0, -8, 3, 0, 8, -8, -15, 10, 0, -8, 3, -15};
        //int[] numbers = new int[15];
        //for( int i = 0; i < numbers.length; i++){
        //    numbers[i]=(int)(Math.random()*41.0-20);
       // }
        for (int i =0; i < numbers.length; i++){
            System.out.print(numbers[i] + " : ");
        }
        System.out.println();
        int number = 0;
        int numbermin = 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if (numbers[j] == numbers[i]){
                    count++;
                    number = numbers[i];
                }
            }
            if (count > max){
                    max = count;
                    numbermin = number;
            } else if (count == max){
                if (number < numbermin){
                    numbermin = number;
                }
            }
            count = 0;
        }
        if (max == 1){
            System.out.println("совпадений нет");
        } else {
            System.out.println(numbermin);
        }
    }
}
