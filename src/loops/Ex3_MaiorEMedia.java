package loops;
/*Faça um programa que leia 5 números
e informe o maior número
e a média desses números.*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int cont = 0;
        int soma = 0;
        int maior = 0;

        do{
            System.out.print("Número: ");
            num = scan.nextInt();
            soma +=num;

            if(num > maior) maior = num;

            cont++;
        }while(cont < 5);
        System.out.println("=================");
        System.out.println("Maior: " + maior);
        System.out.println("Média: "+ (soma/cont));
        System.out.println("=================");
    }
}
