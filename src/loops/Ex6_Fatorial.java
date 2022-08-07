package loops;

import java.util.Scanner;

//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fat = scan.nextInt();
        int multiplicacao = 1; //começar com 1 para não zerar, pois é multiplicação

        System.out.print(fat + "! = ");
        for(int i =fat;i>0;i--){
            multiplicacao *=i;
        }
        System.out.print(multiplicacao);
    }
}
