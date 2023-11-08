package EstruturasDeControle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número");
        int numero = Integer.parseInt(valor);
        //Única sentença de código
        if (numero % 2 == 0)
            System.out.println("O número informado é par!!!");
        else {
            System.out.println("O número informado é impar!!!");
        }
    }
}
