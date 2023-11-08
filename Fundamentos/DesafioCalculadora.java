package Fundamentos;
import java.util.Scanner;
public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        double num1 = tc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = tc.nextDouble();
        System.out.println("Qual operação deseja fazer? ");
        String operacao = tc.next();
        // Lógica
        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;
        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        tc.close();





    }
}
