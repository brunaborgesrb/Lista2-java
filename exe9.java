/*Elabore um programa que calcule o IMC (Índice de Massa Corporal) de uma pessoa, dado o peso e
a altura. Em seguida, exiba se a pessoa está abaixo do peso, com peso normal, com sobrepeso,
obesa ou muito obesa. */
/*Abaixo de 18,5: abaixo do peso/ Entre 18,6 e 24,9: peso ideal/ Entre 25,0 e 29,9: levemente acima do peso
 Acima de 30: obesidade/ Acima de 40: obesidade mórbida */

import java.util.Scanner;

public class exe9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double peso, altura, imc;
        System.out.println("insira seu peso: ");
        peso = input.nextDouble();
        System.out.println("insira sua altura: ");
        altura = input.nextDouble();

        imc = peso / (altura*altura);

        if(imc < 18.5){
            System.out.println("você está abaixo do peso!");
        }
        else if (imc >= 18.5 && imc < 24.9){
            System.out.println("seu peso está ideal!");
        }
        else if (imc >= 25.0 && imc < 29.9){
            System.out.println("você está levemente acima do peso!");
        }
        else if (imc >= 30.0 && imc < 39.9){
            System.out.println("você está obeso(a)");
        }
        else {
            System.out.println("você está obeso mórbido");
        }
    }
}
