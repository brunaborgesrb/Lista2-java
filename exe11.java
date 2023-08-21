/*Desenvolva um programa que leia o salário de um funcionário e calcule o valor do seu aumento.
Para salários superiores a R$ 1.500,00, o aumento deve ser de 10%. Caso contrário, o aumento é de
15%. */

import java.util.Scanner;

public class exe11 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double salario;
        System.out.println("informe seu salário: ");
        salario = input.nextDouble();
        if(salario > 1500){
            System.out.println("você recebeu um aumento de 10%");
            salario = salario + (salario * 0.10);
            System.out.println("novo salário: " + salario);
        }else{
            System.out.println("você recebeu um aumento de 15%");
            salario = salario + (salario * 0.15);
            System.out.println("novo salário: " + salario);
           
        }
    }
}
