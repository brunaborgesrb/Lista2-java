/*Receba um número decimal do usuário e arredonde-o para o inteiro mais próximo usando a
estrutura de controle try/catch para tratar exceções. */

import java.util.Scanner;

public class exe16 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float numDec;
    
        try {
            System.out.println("insira um número decimal: ");
            numDec = input.nextFloat();

            int numeroArredondado = (int) Math.round(numDec);
            
            System.out.println("O número arredondado é: " + numeroArredondado);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro" );
        } 
        

    }
}
