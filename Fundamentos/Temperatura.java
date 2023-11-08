package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // ( F - 32) x 5/9 = c
    double fahrenheit = 86;
    final double ajuste = 32;
    final double fator = 5/9.0;
    double celsius = (fahrenheit - ajuste) * fator;
        System.out.println("celsius = " + celsius);
    }
}
