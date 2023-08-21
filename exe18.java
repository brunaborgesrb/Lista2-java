/* Peça ao usuário que insira o seu estado civil e, usando a estrutura switch/case, exiba uma
mensagem informando se é solteiro, casado, divorciado ou viúvo.*/

import java.util.Scanner;

public class exe18 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String estadoCivil;
        System.out.println("qual é o seu estado civil?");
        estadoCivil = input.nextLine();

        switch (estadoCivil) {
            case "solteiro":
                System.out.println("você é solteiro!");
                break;
            case "casado":
                System.out.println("você é casado!");
                break;
            case "divorciado":
                System.out.println("você é divorciado!");
                break;
            case "viúvo":
                System.out.println("você é viúvo!");
                break;
        
            default:
                System.out.println("Estado civil não reconhecido!");
                break;
        }
    }
}
