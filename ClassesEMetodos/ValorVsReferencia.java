package ClassesEMetodos;

public class ValorVsReferencia {
    public static void main(String[] args) {
        int a = 2;
        int b = a; // atribuição por valor (Tipo primitivo)
        a++;
        b--;
        System.out.println(a + " " + b);

        DesafioData d1 = new DesafioData(1,12,2006);
        DesafioData d2 = d1; // atribuição  por referência (Objeto)

        d1.dia = 07;
        d2.mes = 12;
        d1.ano = 2006;
        System.out.println(d1.obterData());
        System.out.println(d2.obterData());
    }
}
