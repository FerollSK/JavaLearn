package Level_2.Decomposition;

public class Task_9 {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        int z = 10;
        int t = 15;

        System.out.println(area(x, y, z, t));
    }

    private static double area(int x, int y, int z, int t) {
        double g = Math.sqrt(x * x + y * y); // гипотенуза
        double p = (z + t + g) / 2; // полупериметр непрямоугольного треугольника
        double h = (2 * Math.sqrt(p * (p - g) * (p - z) * (p - t))) / g; // высота непрямоугольного треугольника
        double area = 0.5 * x * y + 0.5 * g * h;
        return area;
    }
}
