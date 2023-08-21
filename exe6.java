/*Crie um programa que receba o nome de duas pessoas e exiba qual delas possui o maior número
de caracteres em seu nome.*/

import java.util.Scanner;

public class exe6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome1, nome2;
        System.out.println("insira o primeiro nome: ");
        nome1 = input.nextLine();
        System.out.println("insira o segundo nome: ");
        nome2 = input.nextLine();

        int tamanhoNome1 = nome1.length();
        int tamanhoNome2 = nome2.length();

        if (tamanhoNome1 > tamanhoNome2) {
            System.out.println(nome1 + " possui mais caracteres em seu nome");
        } else if (tamanhoNome2 > tamanhoNome1) {
            System.out.println(nome2 + " possui mais caracteres em seu nome");
        } else {
            System.out.println("os dois nomes possuem o mesmo número de caracteres");
        }

    }
}
