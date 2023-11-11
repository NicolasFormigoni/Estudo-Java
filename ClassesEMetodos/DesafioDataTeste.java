package ClassesEMetodos;

import java.util.Scanner;
//SEGUNDA PARTE DO PROGRAMA
public class DesafioDataTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        DesafioData chamar = new DesafioData();
        System.out.println("Informe o dia do seu nascimento: ");
        chamar.dia = tc.nextInt();
        System.out.println("Informe o mês do seu nascimento: ");
        chamar.mes = tc.nextInt();
        System.out.println("Informe o ano do seu nascimento: ");
        chamar.ano = tc.nextInt();
        System.out.println("Vc nasceu nessa data: " + chamar.obterData());
        tc.close();
    }
}
