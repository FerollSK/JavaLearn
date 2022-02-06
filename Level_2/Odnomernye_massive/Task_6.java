package Level_2.Odnomernye_massive;

public class Task_6 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=(int)(Math.random()*21.0-10);
        }
        for (int i =0; i < numbers.length; i++){
                System.out.print(numbers[i] + " : ");
        }
        System.out.println();
        double sum = 0;
        for (int i = 2; i < numbers.length; i++){
            boolean a = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    a = false;
                    break;
                }
            }
            if(a){
                sum = sum + numbers[i];
            }
        }
        System.out.println("\n" + sum);
    }
}
