package ClassesEMetodos;
//PRIMEIRA PARTE DO PROGRAMA
public class DesafioData {
    int dia;
    int mes;
    int ano;

    String obterData(){
        return String.format("%d/%d/%d", dia,mes,ano);
    }
}
