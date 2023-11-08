package ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //Criar um programa que receba um número e diga se ele é um número primo.
        int contadorDeDivisores = 0;
        Scanner tc = new Scanner(System.in);
        System.out.println("informe o número que deseja ver se é primo: ");
        int num = tc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contadorDeDivisores++;
            }
        }
        if (contadorDeDivisores == 0) {
            System.out.println("\nO numero " + num + " é primo.");
        } else {
            System.out.println("\nO numero " + num + " não é primo.");
        }
        tc.close();
    }
}
