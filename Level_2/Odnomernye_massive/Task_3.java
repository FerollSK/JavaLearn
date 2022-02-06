package Level_2.Odnomernye_massive;

public class Task_3 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=Math.random()*21.0-10;
        }
        int plus =0;
        int minus = 0;
        int zero = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                plus++;
            } else if (numbers[i] < 0){
                minus++;
            } else{
                zero++;
            }
        }
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(zero);
    }
}
