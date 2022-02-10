package Level_2.Decomposition;

public class RandomMassive {
    public static int[] randoMassive(int a){
        int[] massive = new int[a];
        for( int i = 0; i < massive.length; i++){
            massive[i]=(int)(Math.random()*21.0-10);
        }
        return massive;
    }
}
