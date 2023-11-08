package EstruturasDeControle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota = tc.nextDouble();
        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválidade!");
            }else if (nota >= 8.1) {
            System.out.println("Nota A, acima da média!");
        }else if (nota >= 6.1) {
            System.out.println("Nota B, pode melhorar!!");
        }else if (nota >= 4.1) {
            System.out.println("Nota C, esta de recuperação!");
        }else if (nota >= 2.1) {
            System.out.println("Nota D, precisa de reforço!");
        }else{
                System.out.println("Nota E, reprovado!!!");
            }
        System.out.println("FIM!");
            tc.close();
        }
    }