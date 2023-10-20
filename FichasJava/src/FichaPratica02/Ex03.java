package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;

        System.out.println("Informe o salário para calcular a taxa a pagar: ");
        salario = input.nextDouble();

        if(salario > 0 && salario <= 15000){
            salario = (salario * 0.2);
            System.out.println("A taxa a pagar é : " + salario);
        }else if( salario > 15000 && salario <= 2000){
            salario = (salario * 0.3);
            System.out.println("A taxa a pagar é : " + salario);
        }else if( salario > 2000 && salario <= 25000){
            salario = (salario * 0.35);
            System.out.println("A taxa a pagar é : " + salario);
        }else{
            salario = (salario * 0.40);
            System.out.println("A taxa a pagar é : " + salario);
        }
    }
}
