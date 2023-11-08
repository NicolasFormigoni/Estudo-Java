package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // informações da empresa

        // Tipos numéricos inteiros
        byte anos = 23;
        short numerosDeVoos = 512;
        int id = 61321;
        long pontoAcumulados = 3_132_2131_21L;

        // Tipos números reais
        float salario = 3_433_12;
        double vendasAcomoladas = 2_991_797_103.09;

        // Tipo boolean
        boolean ferias = true;

        //Tipo char
        char status = 'A';

        // Dias da Empresa
        System.out.println("Esse funcionario trabalho todos esses dias " + anos * 365);

        //Números de viajem
        System.out.println("Esses foram os números de ida e volto das viajem " + numerosDeVoos / 2);

        //Ponto por real
        System.out.println("Esse foi o total de pontos em real " + pontoAcumulados / vendasAcomoladas);

        //salario
        System.out.println(id + " Ganha " + salario);

        //Ferias
        System.out.println("ferias?" + ferias);

        //Ativo ou Não ativo
        System.out.println("Status" + status);
    }
}
