package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroInicial = 0, numero, numeroFinal = 0;

        System.out.println("Informe um número: ");
        numero = input.nextInt();

        numeroInicial = numero - 5;
        numeroFinal  = numero + 5;

        while (numero > numeroInicial) {
            System.out.println(numeroInicial);
            numeroInicial = numeroInicial + 1;
        }

        while (numero < numeroFinal) {
            System.out.println(numero);
            numero = numero + 1;
        }
    }
}
