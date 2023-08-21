//Faça um programa que verifique se um número é par ou ímpar.

import java.util.Scanner;

public class exe4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        System.out.println("insira um número: ");
        numero = input.nextInt();

        if (numero % 2 == 0 ){
            System.out.println("o número é par");
        }
        else {
            System.out.println("o número é ímpar");
        }
    }
}
