package Fundamentos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 9; //3 maior que 9
        System.out.println(condicao1 && condicao2); // false
        System.out.println(condicao1 || condicao2); // true
        System.out.println(condicao1 ^ condicao2); // true
        System.out.println(!condicao1);
        System.out.println(!condicao2);
    }
}
