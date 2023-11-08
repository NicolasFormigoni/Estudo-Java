package EstruturasDeControle;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite uma idade de 1 a 4 anos: ");
        int idade = tc.nextInt();
        switch (idade){
            case 1:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe falar");
            case 3:
                System.out.println("Sabe andar");
            case 4:
                System.out.println("Sabe respirar");
        }
    }
}
