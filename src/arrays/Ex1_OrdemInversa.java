package arrays;
// crie um vetor de 6 numeros inteiros
//e mostre os na ordem inversa

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = {0, -5, 14, 6, 8, 9};

        int cont = 0;
        while(cont < vetor.length){//enqt for menor que 6
            System.out.print(vetor[cont]+ " ");
            System.out.println("");
            cont++;
        }

        for(int i=vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i]+ " ");
        }

    }
}
