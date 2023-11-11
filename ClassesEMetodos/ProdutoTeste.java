package ClassesEMetodos;

import java.util.Scanner;
// SEGUNDA PARTE DO PROGRAMA
public class ProdutoTeste {
    public static void main(String[] args) {
        Produto ler = new Produto();
        Scanner tc = new Scanner(System.in);
        System.out.println("Informe o produto: ");
        ler.nome = tc.nextLine();
        System.out.println("Informe o preço do produto: ");
        ler.preco = tc.nextDouble();
        System.out.println("Infome o desconto desse produto: ");
        ler.desconto = tc.nextDouble();
        ler.precoComDesconto();
        System.out.println("O produto " + ler.nome + " ficou o total igual a: " + ler.precoComDesconto());
        tc.close();
    }
}
