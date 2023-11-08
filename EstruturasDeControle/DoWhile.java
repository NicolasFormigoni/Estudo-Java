package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String texto = "";
        do {
            System.out.println("Você precisa falar as palavras mágicas....");
            System.out.println("Quer sair?");
            texto = tc.nextLine();
        } while (!texto.equalsIgnoreCase("Por favor"));
        System.out.print("Obrigado!");
        tc.close();
    }
}
