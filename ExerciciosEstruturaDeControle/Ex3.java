package ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /*
        Criar um programa que receba duas notas parciais, calcular a média final.
        Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
         */
        Scanner tc = new Scanner(System.in);
        System.out.println("Infome as duas notas: ");
        double nota1 = tc.nextDouble();
        double nota2 = tc.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media < 7 && media >= 4) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        tc.close();
    }
}
