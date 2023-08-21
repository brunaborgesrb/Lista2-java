//Desenvolva um programa que leia um caractere e verifique se ele é uma vogal ou uma consoante.

import java.util.Scanner;

public class exe7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char caractere;
        System.out.println("digite um caractere: ");
        caractere = input.next().charAt(0);

        if (Character.isLetter(caractere)) {
            if (isVogal(caractere)) {
                System.out.println(caractere + " é uma vogal");
            } else {
                System.out.println(caractere + " é uma consoante");
            }
        } else {
            System.out.println("O caractere digitado não é uma letra");
        }
    }
    public static boolean isVogal(char c) {
        char letra = Character.toLowerCase(c);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

}
