package ClassesEMetodos;
// PRIMEIRA PARTE DO PROGRAMA
public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
        return preco * (desconto - 0.01);
    }
}
