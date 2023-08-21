/*Solicite ao usuário dois números inteiros e, usando a estrutura switch/case, exiba o resultado da
operação escolhida pelo usuário (1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão). */

import java.util.Scanner;

public class exe19 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, operacao;
        System.out.println("insira um número: ");
        num1 = input.nextInt();
        System.out.println("insira outro número: ");
        num2 = input.nextInt();
        System.out.println("ESCOLHA: 1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão");
        operacao = input.nextInt();

        switch (operacao) {
            case 1:
                int soma = num1+num2;
                System.out.println("o resultado da soma é: " + soma);
                break;
            case 2:
                int subtracao = num1-num2;
                System.out.println("o resultado da subtração é: " + subtracao);
            break;
            case 3:
                int multiplicacao = num1*num2;
                System.out.println("o resultado da multiplicação é: " + multiplicacao);
            break;
            case 4:
                int divisao = num1/num2;
                System.out.println("o resultado da divisao é: " + divisao);
            break;

            default:
                break;
        }

    }
}
