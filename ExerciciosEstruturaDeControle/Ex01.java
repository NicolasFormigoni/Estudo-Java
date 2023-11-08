package ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = tc.nextInt();
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("O numero " + numero + " está entre 0 e 10 e é um par.");
            } else {
                System.out.println("O numero " + numero + " está entre 0 e 10 mas não é um par.");
            }
        } else {
            System.out.println("Número fora de 0 a 10");
        }
        tc.close();
    }
}
