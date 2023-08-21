//Faça um programa que receba três números e os imprima em ordem crescente.

import java.util.Scanner;
import java.util.Arrays;

public class exe8{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, num3;
        System.out.println("insira o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("insira o segundo número: ");
        num2 = input.nextInt();
        System.out.println("insira o terceiro número: ");
        num3 = input.nextInt();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("números em ordem crescente: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}