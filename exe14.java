/*Elabore um programa que leia um número inteiro de 1 a 5 e exiba a mensagem "Muito bom",
"Bom", "Regular", "Insuficiente" ou "Muito insuficiente", de acordo com o valor lido, utilizando
switch/case. */

import java.util.Scanner;

public class exe14 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        System.out.println("insira um número inteiro de 1 a 5: ");
        numero = input.nextInt();

        switch (numero) {
            case 1:
                System.out.println("muito insuficiente!");
                break;
            case 2:
                System.out.println("insuficiente!");
                break;
            case 3:
                System.out.println("regular!");
                break;
            case 4:
                System.out.println("bom!");
                break;
            case 5:
                System.out.println("muito bom!");
                break;
            default:
                System.out.println("digite novamente");
                break;
        }
    }
}
