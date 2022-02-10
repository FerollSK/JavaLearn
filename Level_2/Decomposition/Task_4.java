package Level_2.Decomposition;

public class Task_4 {
    public static void main(String[] args) {
        Сoordinates[] points = new Сoordinates[6];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Сoordinates();
        }

        double max = 0;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double a = distance(points[j], points[i]);
                if (a > max) {
                    max = a;
                }
            }
        }
        System.out.println(max);
    }

    private static double distance(Сoordinates a, Сoordinates b) {
        double dist = Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y));
        return dist;
    }
}

class Сoordinates {
    int x = (int) (Math.random() * 50);
    int y = (int) (Math.random() * 50);
}
