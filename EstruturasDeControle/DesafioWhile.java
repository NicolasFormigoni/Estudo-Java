package EstruturasDeControle;

import java.util.Scanner;
public class DesafioWhile {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int quantidade = 0;
        double nota = 0;
        double total = 0;
        while (nota != -1) { // enquanto a nota ser diferente de -1, continua rodand, se for igual a -1 saia
            System.out.println("Informe a nota: ");
            nota = tc.nextDouble();
            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidade++;
            } else if (nota != -1) {
                System.out.println("Nota invalidade, digite novamente");
            }
        }
            double media;
            media = total / quantidade;
            System.out.println("Media = " + media);
    }
}