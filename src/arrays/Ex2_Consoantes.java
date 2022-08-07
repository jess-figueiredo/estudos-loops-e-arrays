package arrays;
/*faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidar.
imprima as consoantes*/
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; //array é um objeto.
        int quantConsoantes = 0;
        int cont = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            //ignore case não é sensitive case!!!
            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))){
                consoantes[cont] = letra;
                quantConsoantes++;
            }
            cont++;
        }while(cont < consoantes.length);
        //para cada desse: imprima um desse
        for (String consoante:consoantes) {
            if(consoante != null)
            System.out.print(consoante + " ");
        }
        System.out.println("");
        System.out.println("Quantidade de consoantes: "+ quantConsoantes);
    }
}
