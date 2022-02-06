package Level_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int alenght=Lenght.lenghtCount(a);
        int[] adigits = new int[alenght];
        int blenght=Lenght.lenghtCount(b);
        int[] bdigits = new int[blenght];
        for (int i = 0; i <alenght ; i++) {
            int result = a%10;
            a=a/10;
            for (int j = 0; j < adigits.length; j++) {
                adigits[i] = result;
            }
            //System.out.println(result);

        }
        for (int i = 0; i <blenght ; i++) {
            int result = b % 10;
            b = b / 10;
            for (int j = 0; j < bdigits.length; j++) {
                bdigits[i] = result;
            }
            //System.out.println(result);
        }
        for (int i = 0; i < adigits.length; i++) {
            for (int j = 0; j < bdigits.length; j++) {
                if (adigits[i]==bdigits[j]){
                    System.out.println(adigits[i]);
                }

            }

        }




        }
        




    }

