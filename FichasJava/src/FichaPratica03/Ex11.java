package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int numInteiro = 5, contador;

        while(numInteiro != -1){
            System.out.println("Adivinhe o número que pare o programa: ");
            numInteiro = input.nextInt();
            //contador = numInteiro+1;
            if(numInteiro > 0 && numInteiro < 25){
                System.out.println("[00,25]" + numInteiro);
            }
        }
    }
}
