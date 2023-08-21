/*Crie um programa que leia um valor em metros e o converta para centímetros, milímetros e
quilômetros. Utilize o bloco try/catch para tratar possíveis exceções durante os cálculos. */

import java.util.Scanner;

public class exe21 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try {
            System.out.print("digite o valor em metros: ");
            double metros = input.nextDouble();
            
            double centimetros = metros * 100;
            double milimetros = metros * 1000;
            double quilometros = metros / 1000;
            
            System.out.println("valor em centímetros: " + centimetros);
            System.out.println("valor em milímetros: " + milimetros);
            System.out.println("valor em quilômetros: " + quilometros);
        } catch (Exception e) {
            System.out.println("ocorreu um erro");
        }
    }
}
