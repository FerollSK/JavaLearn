package Level_3;

/*
//В строке найти количество цифр
*/

public class Task_4 {
    public static void main(String[] args) {
        String s = "I need 12 to find the 3342 numbers 43 of 5 digits in a 11230 string";

        //String d = s.replaceAll("[^0-9 .]", "");

        System.out.println(numbersInString(s));
    }

    private static int numbersInString(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (Character.isDigit(s.charAt(i + 1)) == false) {
                    count++;
                }
            }
        }
        return count;
    }

}
