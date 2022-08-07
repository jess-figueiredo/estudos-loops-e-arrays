package loops;
//impar e par
import java.util.Scanner;

public class Ex3_PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntdNumeros;
        int par = 0;
        int impar = 0;

        System.out.println("Qntd de números: ");
        qntdNumeros = scan.nextInt();

        int cont = 0;
        do{
            System.out.println("Número: ");
            int numero = scan.nextInt();

            if(numero%2==0) par++;
            else impar++;

            cont++;
        }while(cont < qntdNumeros);

        System.out.println("===================");
        System.out.println("Quantidade Par: "+par);
        System.out.println("Quantidade impar: "+impar);
    }
}
