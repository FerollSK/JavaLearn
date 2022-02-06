package Level_2.Odnomernye_massive;

public class Task_5 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=(int)(Math.random()*21.0-10);
        }
        for (int i =0; i < numbers.length; i++){
            if (numbers[i] > i){
                System.out.print(numbers[i] + " : ");
            }
        }
    }
}
