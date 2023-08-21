/*Peça ao usuário que insira a sua idade e verifique se ele é um bebê (0 a 1 ano), criança (1 a 12
anos), adolescente (13 a 18 anos) ou adulto (mais de 18 anos). */

import java.util.Scanner;

public class exe17 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int idade;
        System.out.println("insira a sua idade: ");
        idade = input.nextInt();

        if (idade <= 1){
            System.out.println("você é um bebê");
        }
        else if (idade > 1 && idade <= 12){
            System.out.println("você é uma criança");
        }
        else if (idade >= 13 && idade <= 18){
            System.out.println("você é um adolescente");
        }
        else{
            System.out.println("você é um adulto");
        }

    }
}
