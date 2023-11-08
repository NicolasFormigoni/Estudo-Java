package EstruturasDeControle;

import java.util.Scanner;

public class DesafioIf {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Informe o dia da semana: ");
        String dia = tc.next();
        //Não use == String com comparação com String
        if ("Domingo".equalsIgnoreCase(dia)) {
            System.out.println(1);
        } else if ("Segunda".equalsIgnoreCase(dia)) {
            System.out.println(2);
        } else if ("Terça".equalsIgnoreCase(dia) || (dia.equalsIgnoreCase("Terca"))) {
            System.out.println(3);
        } else if ("Quarta".equalsIgnoreCase(dia)) {
            System.out.println(4);
        } else if ("Quinta".equalsIgnoreCase(dia)) {
            System.out.println(5);
        } else if ("Sexta".equalsIgnoreCase(dia)) {
            System.out.println(6);
        } else if ("Sábado".equalsIgnoreCase(dia) || (dia.equalsIgnoreCase("Sabado"))) {
            System.out.println(7);
        } else {
            System.out.println("Nome da semana inválido!!!");
        }
        tc.close();
    }
}
