package loops;
//Faça um prog que peça uma nota, entre zero e dez.
//        mostre uma mensagem caso o valor seja invalido.
//Continue pedindo até o usuário inserir um valor válido.

import java.util.Scanner;

public class Ex2_nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota< 0|| nota >10){
            System.out.println("Nota inválida. Digite novamente a");
            System.out.println("Nota: ");
            nota = scan.nextInt();
        }
    }
}

