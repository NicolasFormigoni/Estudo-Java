package Fundamentos;

import java.util.Scanner;
public class TipoStringEquals {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = tec.next();
        boolean resultado = "nick".equals((palavra.trim()).toLowerCase());
        System.out.println(resultado);
        /*
         equals compara o valor.
         trim tira espaço ou se for pegar so uma palavra, utiliza next, pq ele tira o espaço
         toLowerCase n vai se importar se for letra minuscula ou maiuscula
         */
        tec.close();
    }
}
