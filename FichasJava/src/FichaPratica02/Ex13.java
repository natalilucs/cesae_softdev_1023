package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hora24, minutos;

        System.out.println("Insira a hora para conversão: ");
        hora24 = input.nextInt();
        System.out.println("Insira os minutos: ");
        minutos = input.nextInt();

        switch(hora24){
            case 24:
                System.out.println("12h" + minutos);
                break;
            case 23:
                System.out.println("11h" + minutos);
                break;
            case 22:
                System.out.println("10h" + minutos);
                break;
            case 21:
                System.out.println("09h" + minutos);
                break;
            case 20:
                System.out.println("08h" + minutos);
                break;
            case 19:
                System.out.println("07h" + minutos);
            case 18:
                System.out.println("06h" + minutos);
                break;
            case 17:
                System.out.println("05h" + minutos);
                break;
            case 16:
                System.out.println("04h" + minutos);
            case 15:
                System.out.println("03h" + minutos);
                break;
            case 14:
                System.out.println("02h" + minutos);
                break;
            case 13:
                System.out.println("01h" + minutos);
                break;
            default:
                System.out.println( hora24 + "h" + minutos);
        }
    }
}
