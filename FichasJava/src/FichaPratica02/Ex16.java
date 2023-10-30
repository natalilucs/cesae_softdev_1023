package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        /*Escreva um programa que lê um valor multtiplo de 5, notas 200, 100, 50, 20,10,5 */

        Scanner input = new Scanner(System.in);

        int valor, quantidadeDeNotas;
        System.out.println("Informe um valor");

        valor = input.nextInt();
        if(valor % 5 == 0){
            quantidadeDeNotas=valor/200;
            System.out.println();
            valor=valor%200;

            


        }

    }

}
