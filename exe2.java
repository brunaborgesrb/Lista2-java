//Crie um programa que receba a idade de uma pessoa e exiba se ela é maior de idade ou menor de idade.

import java.util.Scanner;

public class exe2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int idade;
        System.out.println("insira sua idade: ");
        idade = input.nextInt();


        if(idade >= 18){
            System.out.println("você é maior de idade");
        }
        else{
            System.out.println("você é menor de idade");
        }
    }
}
