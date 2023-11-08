package ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Ex9 {
    // Crie um programa que recebe 10 valores e ao final imprima o maior número.
    public static void main(String[] args) {
     /*   System.out.println("Informe os 10 números inteiros: ");
        Scanner tc = new Scanner(System.in);
        int num1 = tc.nextInt();
        int num2 = tc.nextInt();
        int num3 = tc.nextInt();
        int num4 = tc.nextInt();
        int num5 = tc.nextInt();
        int num6 = tc.nextInt();
        int num7 = tc.nextInt();
        int num8 = tc.nextInt();
        int num9 = tc.nextInt();
        int num10 = tc.nextInt();
        if (num1 > num2) {
            System.out.println("Maior número" + num1);
        } else if (num2 > num3) {
            System.out.println("Maior número " + num2);
        } else if (num3 > num4) {
            System.out.println("Maior número " + num3);
        } else if (num4 > num5) {
            System.out.println("Maior número " + num4);
        } else if (num5 > num6) {
            System.out.println("Maior número " + num5);
        } else if (num6 > num7) {
            System.out.println("Maior número " + num6);
        } else if (num7 > num8) {
            System.out.println("Maior número " + num7);
        } else if (num8 > num9) {
            System.out.println("Maior número " + num8);
        } else if (num9 > num10) {
            System.out.println("Maior número " + num9);
        } else{
            System.out.println("Maior número " + num10);
        }
    }
}

      */
        Scanner scanner = new Scanner(System.in);

        int maiorValor = 0;
        int contador = 0;

        do {
            System.out.println("\nDigite um numero: ");
            int valor = scanner.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            contador++;
        } while (contador != 10);

        System.out.printf("O maior valor foi: " + maiorValor);
        scanner.close();
    }
}
