package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutosTotais, segundosTotais, music1, music2,music3,music4, music5;

        System.out.print("Insira os minutos da musica 1: ");
        minutosTotais = input.nextInt();
        System.out.print("Insira os segundos da musica 1: ");
        segundosTotais = input.nextInt();
        System.out.print("Insira os minutos da musica 2: ");
        minutosTotais = minutosTotais + input.nextInt();
        System.out.print("Insira os segundos da musica 2: ");
        segundosTotais = segundosTotais + input.nextInt();
        System.out.print("Insira os minutos da musica 3: ");
        minutosTotais = minutosTotais + input.nextInt();
        System.out.print("Insira os segundos da musica 3: ");
        segundosTotais = segundosTotais + input.nextInt();
        System.out.print("Insira os minutos da musica 4: ");
        minutosTotais = minutosTotais + input.nextInt();
        System.out.print("Insira os segundos da musica : ");
        segundosTotais = segundosTotais + input.nextInt();
        System.out.print("Insira os minutos da musica 5: ");
        minutosTotais = minutosTotais + input.nextInt();
        System.out.print("Insira os segundos da musica 5: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.print(minutosTotais +"min" +segundosTotais + "s");

    }
}
