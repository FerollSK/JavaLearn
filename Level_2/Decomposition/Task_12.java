package Level_2.Decomposition;


public class Task_12 {
    public static void main(String[] args) {
        int a = 1287198;
        int b = 543;
        double c = 241.14124;

        //StringBuilder sb = new StringBuilder();
        //sb.append(b);
        //s = s.replaceAll("\\p{Cntrl}", "");
        //sb.delete(sb.indexOf("."), sb.indexOf(".") + 1);

        String s = ("" + b + ", " + 2342).replaceAll("[,. ]", "");

        System.out.println(s);

    }


}
