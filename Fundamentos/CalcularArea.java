package Fundamentos;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("informe a base: ");
        double b = tc.nextDouble();
        System.out.println("informe a altura: ");
        double h = tc.nextDouble();
        double resultado = (b*h)/2;
        System.out.println("A aréa é " + resultado);
    }
}
