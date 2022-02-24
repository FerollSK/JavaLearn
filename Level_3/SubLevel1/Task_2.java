package Level_3.SubLevel1;

/*
//Замените в строке все вхождения 'word' на 'letter'
*/

public class Task_2 {
    public static void main(String[] args) {
        String s = "I want replace word word on letter";

        String s1 = s.replace("word", "letter"); 
        System.out.println(s1);
    }
}
