package Fundamentos;
import java.util.Scanner;
public class ConversaoCelsius {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a temperatura desejada: ");
        double celsius = tc.nextDouble();
        final double ajuste = 32;
        final double fator = 9.0/5;
        double calculo = (celsius * fator) + 32;
        System.out.println("O resultado será de : " + calculo);
    }
}
