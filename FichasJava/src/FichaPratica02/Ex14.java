package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Insira 3 numeros, primeiro: ");
        num1 = input.nextInt();
        System.out.println("segundo: ");
        num2 = input.nextInt();
        System.out.println("terceiro: ");
        num3 = input.nextInt();
        if(num1 < num2) {
            if (num2 < num3) {
                if (num3 < num1) {
                    {
                        System.out.println("Numero em Ordem crescente: " + num1 + " " + num2 + " " + num3);
                    }
                }
            }
        }
        else if (num1 > num2) {
                if (num3 > num2) {
                    System.out.println("Numero em Ordem crescente: " + num2 + " " + num1 + " " + num3);
                }
            } else {
                System.out.println("Numero em Ordem crescente: " + num3 + " " + num2 + " " + num1);
            }

    }
}
