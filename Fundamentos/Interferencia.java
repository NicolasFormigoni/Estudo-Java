package Fundamentos;

public class Interferencia {
    public static void main(String[] args) {
        var a = 31;//esta inferindo o tipo da variavel pelo valor que foi inicializada,o exemplo é int
        System.out.println(a);
        var b = "Text";
        System.out.println(b);
        var c = 321.345;
        System.out.println(c);
    }
}