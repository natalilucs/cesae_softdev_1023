package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Informe o sálario: ");

        salario = input.nextDouble();

        if(salario <= 2000){
            salario= salario*0.20;
            System.out.println("O valor da taxa de 20% é: " + salario);
        } else {
            salario= salario*0.30;
            System.out.println("O valor da taxa de 30% é: " + salario);
        }
    }
}
