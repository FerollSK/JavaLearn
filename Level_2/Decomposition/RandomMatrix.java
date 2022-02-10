package Level_2.Decomposition;

public class RandomMatrix {
    public static int[] randoMatrix(int a){
        int[] matrix = new int[a];
        for( int i = 0; i < matrix.length; i++){
            matrix[i]=(int)(Math.random()*21.0-10);
        }
        return matrix;
    }
}
