package Level_1;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class TwoNumbers {
    public static void main(String[] args) {
        double oneNumber = 180037;
        double twoNumber = 9376.12;

        int a = BigDecimal.valueOf(oneNumber).scale();
        int b = BigDecimal.valueOf(twoNumber).scale();

        double k = oneNumber*Math.pow(10,a);
        double m = twoNumber*Math.pow(10,b);

        long x = (long)k;
        long y = (long)m;
        int c, d;

        Set<Integer> list = new HashSet<>();

        for(long i = x; i > 0; i = i / 10) {
            c = (int)(i % 10);
            for(long j = y; j > 0; j = j / 10) {
                d = (int)(j % 10);
                if (d == c){
                    list.add(d);
                }
            }
        }
        for(int f : list){
            System.out.println(f);
        }
    }
}