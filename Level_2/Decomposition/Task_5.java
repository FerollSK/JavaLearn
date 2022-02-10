package Level_2.Decomposition;

public class Task_5 {
    public static void maain(String[] args) {
        int n = RandomNumber.number();
        Сoordinates[] points = new Сoordinates[n];

    }

    private static double distance(Сoordinates a, Сoordinates b) {
        double dist = Math.sqrt((a.x * a.x) + (b.x * b.x));
        return dist;
    }
}

class Сoordinates {
    int x;
    int y;
}
