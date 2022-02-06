package Level_2.Odnomernye_massive;

public class Task_4 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=(int)(Math.random()*21.0-10);
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " : ");
        }
        double max = 0;
        double min = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            } else if(numbers[i] < min){
                min = numbers[i];
            }
        }
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == max ){
                numbers[i] = min;
            } else if (numbers[i] == min){
                numbers[i] = max;
            }
        }
        System.out.println();
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " : ");
        }
    }
}
