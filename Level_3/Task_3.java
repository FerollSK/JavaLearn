package Level_3;

/*
//В строке найти количество цифр
*/

public class Task_3 {
    public static void main(String[] args) {
        String s = "I need 12 to find the 3 numbers of 5 digits in a 10 string";
        
        System.out.println(numbersDigits(s));
    }

    private static int numbersDigits(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
