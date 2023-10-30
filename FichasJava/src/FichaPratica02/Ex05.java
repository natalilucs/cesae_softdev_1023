package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Vamos decobrir quem é o maior, Informe um número: ");
        num1 = input.nextInt();
        System.out.print(" Agora informe outro número: ");
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.print(num2 + " " + num1);
        } else {
            System.out.print(num1 + " " + num2);
        }
    }
}
