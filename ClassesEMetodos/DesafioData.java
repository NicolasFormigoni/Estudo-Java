package ClassesEMetodos;
//PRIMEIRA PARTE DO PROGRAMA
public class DesafioData {
    int dia;
    int mes;
    int ano;

    String obterData(){
        return String.format("%d/%d/%d", dia,mes,ano);
    }
    DesafioData(int diaFinal, int mesFinal, int anoFinal){
        dia = diaFinal;
        mes = mesFinal;
        ano = anoFinal;
    }
    DesafioData(){
        dia = 01;
        mes = 01;
        ano = 1970;
    }
}
