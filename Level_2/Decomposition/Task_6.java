package Level_2.Decomposition;

public class Task_6 {
    public static void main(String[] args){
        int[] massive = {5, 3, 9};
        vzaimProst(massive);

    }

private static void vzaimProst(int[] massive){
   
    int count = 0;
    
    for (int i = 0; i < massive.length - 1; i++) {
        for (int j = 1; j < massive.length; j++) {
            if (Nod.nod(massive[j], massive[i]) != 1){  
                count ++;                  
            }
        }
    }
    if (count == 1){
        System.out.println("Данные числа являются взаимно простыми");
    }
    else{
        System.out.println("Данные числа не являются взаимно простыми");
    }
}


}
