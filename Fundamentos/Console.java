package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = tc.nextInt();
        tc.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = tc.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = tc.nextLine();
        System.out.printf("%s %s tem %d anos", nome, sobrenome, idade);
        tc.close();
    }
}