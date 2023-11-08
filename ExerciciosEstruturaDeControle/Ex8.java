package ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Ex8 {

     //Criar um programa que receba uma palavra e imprime no console letra por letra.
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite a palavra: ");
        String palavra = tc.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        tc.close();
    }
}
