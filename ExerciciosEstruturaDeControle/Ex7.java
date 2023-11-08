package ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
            /*
        Criar um programa que enquanto estiver recebendo números positivos,
        imprime no console a soma dos números inseridos,
         caso receba um número negativo, encerre o programa.
         Tente utilizar a estrutura do while.
         */
        Scanner tc = new Scanner(System.in);
        int num = 0;
        int somadorDeNum = 0;
        while (num >= 0) {
            System.out.println("Digite os números desejados, caso queria sair, digite um número negativo");
            num = tc.nextInt();
            if (num >= 0) {
                somadorDeNum += num;
                System.out.println("A soma é " + somadorDeNum);
            }
        }
        System.out.println("Você saiu do programa");
        tc.close();
    }
}