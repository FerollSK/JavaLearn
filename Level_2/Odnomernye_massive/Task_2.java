package Level_2.Odnomernye_massive;

public class Task_2 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=(int)(Math.random()*21.0-10);
        }
        int a = 8;
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > a){
                numbers[i] = a;
                count++;
            }
        }
        System.out.println(count);
    }
}
