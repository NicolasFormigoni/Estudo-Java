package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(0)); // qual é a letra no indice 0.
        String s = "Boa tarde"; // a partir do momento que você da o valor na variavel, não tem como modificar, imutavel.
        s = s.toUpperCase();
        s = "Bom dia";
        System.out.println(s.concat("!!!!"));
        System.out.println(s.toLowerCase().startsWith("bom")); // ignora se for letra maiuscula ou minuscula, inicia com
        System.out.println(s.endsWith("dia")); // termina com
        System.out.println(s.length());// comprimento ou carácter
        System.out.println(s.equalsIgnoreCase("bom dia")); // para saber se a frase é correta
        System.out.println("Frase qualquer".contains("gosto"));// dentro dela tem gosto?
        System.out.println("Nicolas Formigoni".indexOf("o")); // qual o indice
        System.out.println("Eu gosto de voce".substring(3)); // a partir do indice a palavra começa
        System.out.println("Eu amo voce".substring(3,6)); // comeca e termina nos indices
        var nome  = "Nick";
        var sobrenome = "Formigoni";
        var idade = 32;
        var salario = 123232.2121;
        System.out.printf("O senhor %s %s tem %d e ganha R$ %.2f"
                , nome, sobrenome, idade, salario); //%s é String, %d é valores inteiros, %f pontos flutuantes

        String frase = String.format("\nO senhor %s %s tem %d e ganha R$ %.2f"
                , nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
