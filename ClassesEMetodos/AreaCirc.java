package ClassesEMetodos;
//PRIMEIRA PARTE
public class AreaCirc {
    double raio;
    final static double pi = 3.14;

    AreaCirc(double raioInicial) { // construtor
        raio = raioInicial;
    }

    double area() {
        return pi * Math.pow(raio, 2); // método
    }

  static double area(double raio) { // método static
        return pi * Math.pow(raio, 2);
    }
}