/*Desenvolva um programa que leia o nome e a idade de uma pessoa. Utilize o bloco try/catch para
garantir que a idade digitada seja um valor inteiro válido. */

import java.util.Scanner;

public class exe20 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try {
            System.out.print("digite o nome: ");
            String nome = input.nextLine();
            
            System.out.print("digite a idade: ");
            int idade = input.nextInt();
            
            System.out.println("nome: " + nome);
            System.out.println("idade: " + idade);
        } catch (Exception e) {
            System.out.println("ocorreu um erro" );
        }
    }
}
