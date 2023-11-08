package Fundamentos;

import java.util.Scanner;
public class DesafioConversao {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o primeiro sálario : ");
        String sala1 = tc.nextLine().replace(",", ".");
        System.out.print("Digite o segundo sálario : ");
        String sala2 = tc.nextLine().replace(",", ".");
        System.out.print("Digite o terceiro sálario : ");
        String sala3 = tc.nextLine().replace(",", ".");
        double salari1 = Double.parseDouble(sala1);
        double salari2 = Double.parseDouble(sala2);
        double salari3 = Double.parseDouble(sala3);
        double somaSalario = salari1 + salari2 + salari3;
        double divideSalario = (salari1 + salari2 + salari3 ) / 3;
        System.out.println("A soma dos 3 salarios é " + somaSalario);
        System.out.println("A divisão dos 3 salarios é " + divideSalario);
        tc.close();
    }
}
