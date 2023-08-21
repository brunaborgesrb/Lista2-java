/*Peça ao usuário que insira o dia da semana (por extenso) e, em seguida, exiba uma mensagem
informando se é um dia útil ou um fim de semana. */


import java.util.Scanner;


public class exe13 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String diaSemana;
        System.out.println("insira o dia da semana (por extenso): ");
        diaSemana = input.nextLine();


        switch(diaSemana){
            case "segunda":
                System.out.println("É um dia útil!");
            break;
            case "terça":
                System.out.println("É um dia útil!");
            break;
            case "quarta":
                System.out.println("É um dia útil!");
            break;
            case "quinta":
                System.out.println("É um dia útil!");
            break;
            case "sexta":
                System.out.println("É um dia útil!");
            break;
            case "sábado":
                System.out.println("É um fim de semana!");
            break;
            case "domingo":
                System.out.println("É um fim de semana!");
            break;
            default:
            System.out.println("Insira um dia da semana!");
            break;

        }
    }
   
}

