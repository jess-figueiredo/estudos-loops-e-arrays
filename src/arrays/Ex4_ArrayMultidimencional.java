package arrays;
//gere e imprima uma matrix 4x4 com valores aleatorios entre 0-9
import java.util.Random;

public class Ex4_ArrayMultidimencional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i< M.length;i++){
            for( int j=0 ; j < M[i].length ; j++){
                M[i][j] = random.nextInt(9); // bound é até
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha: M) {
            for (int elementoColuna: linha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }
    }
}
