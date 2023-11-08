package Fundamentos;
import javax.swing.*;
public class ConverteStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
        String valor3 = JOptionPane.showInputDialog("Digite o terceiro número");
        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        double num3 = Double.parseDouble(valor3);
        double soma = num1 + num2 + num3;
        System.out.println("A soma dos dois números é " + soma);
        double divisao = soma/3;
        System.out.println("A media é " + divisao );
        if (divisao >= 6){
            System.out.println("Aluno aprovado!!!");
        }else{
            System.out.println("Aluno reprovado!!!");
        }
    }
}