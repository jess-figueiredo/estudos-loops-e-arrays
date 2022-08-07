package arrays;

import java.util.Random;

/*Faça um programa que leia 20 números inteiros aleatórios entre 0 a 100, armazene os em um vetor.
ao final mostre os numeros e seus sucessores.*/

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numale = new int[20];

        for(int i = 0; i < numale.length ; i++){
            int num = random.nextInt(100);
            numale[i] = num;
        }
        //se a necessidade for muito específica não é da pra usar foreache
        System.out.println("\nAntecessores dos números aleatórios: ");
        for (int num:numale) {
            System.out.print((num-1) + " ");
        }

        System.out.println("\nNúmeros aleatórios: ");
        for (int num:numale) {
            System.out.print(num + " ");
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int num:numale) {
            System.out.print((num+1) + " ");
        }
    }
}
