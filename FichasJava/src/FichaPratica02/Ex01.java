package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Vamos decobrir quem é o maior, Informe um número: ");
        num1 = input.nextInt();
        System.out.print(" Agora informe outro número: ");
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.print("O número 1 que é maior: " + num1);
        } else if (num2> num1) {
            System.out.print("O segundo é maior: " + num2);
        } else {
            System.out.print("São iguais: num1:"+ num1 + " e num2:" + num2);
        }
    }
}
