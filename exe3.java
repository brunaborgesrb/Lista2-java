//Desenvolva um programa que leia dois números inteiros e mostre qual deles é o maior, ou se são iguais.

import java.util.Scanner;

public class exe3 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2;
        System.out.println("insira um número: ");
        num1 = input.nextInt();
        System.out.println("insira o segundo número: ");
        num2 = input.nextInt();


        if (num1 > num2){
            System.out.println("o primeiro número é maior do que o segundo");
        }
        else if(num1 < num2){
            System.out.println("o segundo número é maior que o primeiro número");
        }
        else{
            System.out.println("os dois números são iguais");
        }
    }
}

