//Escreva um programa que leia um número inteiro e verifique se ele é positivo, negativo ou igual a zero.

import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        System.out.println("insira um número: ");
        numero = input.nextInt();


        if(numero > 0){
            System.out.println("o número é positivo");
        }
        else if (numero < 0){
            System.out.println("o número é negativo");
        }
        else{
            System.out.println("o número é igual a 0");
        }
    }
}


