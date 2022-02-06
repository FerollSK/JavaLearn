package Level_1;

public class Lenght {

    public static int lenghtCount(int parametr){
        int lenght;
        lenght = (int)Math.ceil(Math.log10(parametr+0.5));
        return lenght;

    }
}
