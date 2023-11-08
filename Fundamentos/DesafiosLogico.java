package Fundamentos;
public class DesafiosLogico {
    public static void main(String[] args) {
        boolean trabalho1 = false;
        boolean trabalho2 = false;
        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        System.out.println("Comprou TV de 50 polegadas? " + comprouTV50);
        System.out.println("Comprou TV de 32 polegadas? " + comprouTV32);
        System.out.println("Comprou Sorteve? " + comprouSorvete );
        System.out.println("Mais saudável ? " + !comprouSorvete);
    }
}
