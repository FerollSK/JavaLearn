package Level_2.Decomposition;

import java.util.*;

public class Task_12 {
    public static void main(String[] args) {
        int a = 1287198;
        int b = 543;
        double c = 241.14124;

        // StringBuilder sb = new StringBuilder();
        // sb.append(b);
        // s = s.replaceAll("\\p{Cntrl}", "");
        // sb.delete(sb.indexOf("."), sb.indexOf(".") + 1);

        String s = ("" + b + ", " + 2342).replaceAll("[,. ]", "");
        int t = s.length();

        // System.out.println(t);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");

        // ArrayList<String> list2 = list1;

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World");

        System.out.println(list2.equals(list1));

    }
}
