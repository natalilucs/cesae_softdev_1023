package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lugar;
        System.out.print("Qual lugar ficou na corrida? ");
        lugar = input.nextInt();

        switch (lugar) {
            case 1:
                System.out.print("Ganhou 10 pontos");
                break;
            case 2:
                System.out.print("Ganhou 8 pontos");
                break;
            case 3:
                System.out.print("Ganhou 6 pontos");
                break;
            case 4:
                System.out.print("Ganhou 5 pontos");
                break;
            case 5:
                System.out.print("Ganhou 4 pontos");
                break;
            case 6:
                System.out.print("Ganhou 3 pontos");
                break;
            case 7:
                System.out.print("Ganhou 2 pontos");
                break;
            case 8:
                System.out.print("Ganhou 1 pontos");
                break;
            default:
                System.out.print("Não ganhou pontos");


        }
    }


}
