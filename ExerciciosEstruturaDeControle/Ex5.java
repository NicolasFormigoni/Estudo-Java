package ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //Refatorar o exercício 04, utilizando a estrutura switch.
        int contadorDeDivisores = 0;
        Scanner tc = new Scanner(System.in);
        System.out.println("informe o número que deseja ver se é primo: ");
        int num = tc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contadorDeDivisores++;
            }
        }
        switch (contadorDeDivisores) {
            case 0:
                System.out.println(num + " É número primo");
                break;
            default:
                System.out.println(num + " Não é número primo");
        }
        tc.close();
    }
}

