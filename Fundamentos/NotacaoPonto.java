package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
       String s = "Bom dia X";
        s = s.replace("X", "Nick"); // troca/frase
       s = s.toUpperCase(); // tudo vai ser letra maiuscula
        s = s.concat("!!!!!");
        System.out.println(s);
        // Tipos primitivos não tem "."
    }
}
