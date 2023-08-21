/*Receba um número inteiro do usuário e verifique se ele é divisível por 3 e por 5 ao mesmo tempo,
exibindo uma mensagem apropriada. */

import java.util.Scanner;

public class exe12 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        System.out.print("digite um número inteiro: ");
        numero = input.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("o número é divisível por 3 e por 5");
        } else {
            System.out.println("o número não é divisível por 3 e por 5");
        }
    }
   
}

