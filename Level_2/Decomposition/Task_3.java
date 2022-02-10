package Level_2.Decomposition;

public class Task_3 {
    public static void main(String[] args) {
        int a = RandomNumber.number();

        double area = area(a);
        System.out.println(area);
    }

    private static double radius(double a) {
        double b;
        b = a * (Math.sqrt(3)) / 2;
        return b;
    }

    private static double area(double a) {
        double b = radius(a);
        double area = 0.5 * a * b;
        return area;
    }
}