package Level_2.Odnomernye_massive;

import java.util.ArrayList;

public class Task_8 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for( int i = 0; i < numbers.length; i++){
            numbers[i]=(int)(Math.random()*41.0-20);
        }
        for (int i =0; i < numbers.length; i++){
            System.out.print(numbers[i] + " : ");
        }
        System.out.println();
        int min = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != min){
                list.add(numbers[i]);
            }
        }
        for(int i : list){
            System.out.print(i + " : ");
        }
    }
}
