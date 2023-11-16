package ClassesEMetodos;

import java.util.Scanner;
//SEGUNDA PARTE DO PROGRAMA
public class DesafioDataTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        DesafioData chamar = new DesafioData(01,01,1970);
        System.out.print("Informe o dia do seu nascimento: ");
        chamar.dia = tc.nextInt();
        System.out.print("Informe o mês do seu nascimento: ");
        chamar.mes = tc.nextInt();
        System.out.print("Informe o ano do seu nascimento: ");
        chamar.ano = tc.nextInt();
        System.out.print("Vc nasceu nessa data: " + chamar.obterData());
        tc.close();
    }
}
