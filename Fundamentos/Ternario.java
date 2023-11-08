package Fundamentos;

public class Ternario {
    public static void main(String[] args) {
        //declaração da media
        double media = 6;
        String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";
        System.out.println("O aluno esta " + resultadoFinal);
        System.out.println("________________________________________________");
        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >=7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim." : "Não.";
        System.out.println("Tem desconto ? " + resultado);
    }
}
