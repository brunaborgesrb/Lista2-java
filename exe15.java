/*Peça ao usuário que digite um número entre 1 e 7 e exiba o dia da semana correspondente (1 -
Domingo, 2 - Segunda-feira, etc.). */

import java.util.Scanner;

public class exe15 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("insira um número de 1 a 7: ");
        numero = input.nextInt();

        switch (numero) {
            case 1:
                System.out.println("segunda-feira");
                break;
            case 2:
                System.out.println("terça-feira");
                break;
            case 3:
                System.out.println("quarta-feira");
                break;
            case 4:
                System.out.println("quinta-feira");
                break;
            case 5:
                System.out.println("sexta-feira");
                break;
            case 6:
                System.out.println("sábado");
                break;
            case 7:
                System.out.println("domingo");
                break;
        
            default:
                break;
        }
    
    }
}
