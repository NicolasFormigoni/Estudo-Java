package EstruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String valor = "";
        while (!valor.equalsIgnoreCase("Sair")) {
            System.out.println("Você diz: ");
            valor = tc.nextLine();
        }
    }
}