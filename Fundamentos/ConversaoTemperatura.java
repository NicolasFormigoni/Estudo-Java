package Fundamentos;
import java.util.Scanner;
public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a temperatura desejada: ");
        double temp = tc.nextDouble();
        final double ajuste = 32;
        final double fator = 5/9.0;
        double celsius = (temp- ajuste) * fator;
        System.out.println("celsius = " + celsius);
    }
}
