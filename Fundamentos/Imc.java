package Fundamentos;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        System.out.print("Informe seu peso: ");
       Float peso = 0.0F;
       peso.toString().replace('.',',');
       peso = tc.nextFloat();
        System.out.print("Informe sua altura: ");
        Float altura = 0.0F;
        altura.toString().replace('.',',');
        altura = tc.nextFloat();
        double resultado = peso / (altura * altura) ;
        System.out.printf("Breno tem o imc de %.2f ",resultado);
    }
}
