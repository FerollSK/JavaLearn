package Level_2.Decomposition;

public class Task_1 {
    public static void main(String[] args) {
        int a = RandomNumber.randomNumber();
        int b = RandomNumber.randomNumber();

        System.out.println(a + " : " + b);
        System.out.println(Nod.nod(a, b));
        System.out.println(Nok.nok(a, b));

    }
}
