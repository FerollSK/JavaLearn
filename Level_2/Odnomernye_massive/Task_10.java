package Level_2.Odnomernye_massive;

public class Task_10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=(int)(Math.random()*41.0-20);
        }
        for (int i =0; i < numbers.length; i++){
            System.out.print(numbers[i] + " : ");
        }
        System.out.println();

        for (int i = 1; i < numbers.length; i+=2){
            numbers[i] = 0;
        }
        for (int i =0; i < numbers.length; i++){
            System.out.print(numbers[i] + " : ");
        }
        System.out.println();
        int[] a = new int[10];
        a[1] = 49;
        a[4] = 33;
        a[9] = 23;
        for (int i =0; i < a.length; i++){
            System.out.print(a[i] + " : ");
        }
    }
}
