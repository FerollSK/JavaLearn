package Level_3;

import java.util.Spliterator.OfPrimitive;

public class Task_5 {
    public static void main(String[] args) {
        String s = "   I need 12 to    find the  3342 numbers    43 of 5   digits in a   11230 string";

        String d = s.trim().replaceAll("\s+", " ");
        System.out.println(d);

        // System.out.println(stroka(s));

    }

    // private static String[] stroka(String s) {
    //     String a;
    //     for (int i = 0; i < s.length() - 1; i++) {
    //         if (s.charAt(i) == ' ') {
    //             if (s.charAt(i + 1) == ' ') {
    //                 a = s.substring(0, i - 1) + s.substring(i+1);
    //             } 
    //         }
    //     }
    //     return a; 
    // }

}
