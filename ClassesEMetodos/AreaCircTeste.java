package ClassesEMetodos;
//SEGUNDA PARTE
public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);

       // AreaCirc.pi = 3.1415; // chamando o valor de PI pela classe, pois tem o "STATIC", mas passou a ser final!!

        System.out.println(a1.area());
        System.out.println(AreaCirc.area(100));
    }
}


