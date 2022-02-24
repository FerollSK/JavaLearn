package Level_3.SubLevel1;

public class Task_5 {
    public static void main(String[] args) {
        String s = "   I need 12 to    find the  3342 numbers    43 of 5   digits in a   11230 string";

        System.out.println(stroka(s));

    }

    private static String stroka(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                if (s.charAt(i + 1) == ' ') {
                    s = s.substring(0, i) + s.substring(i + 1);
                    i--;
                }
            }
        }
        return s;
    }

}
