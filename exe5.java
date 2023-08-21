/*Elabore um programa que leia três notas de um aluno e calcule a média. Em seguida, exiba se o
aluno está aprovado (média maior ou igual a 7) ou reprovado. */

import java.util.Scanner;

public class exe5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double nota1, nota2, nota3, media;
        System.out.println("insira a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("insira a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("insira a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        if(media >= 7){
            System.out.println("o aluno está aprovado! ");
        }
        else{
            System.out.println("o aluno está reprovado! ");
        }
    }
}
