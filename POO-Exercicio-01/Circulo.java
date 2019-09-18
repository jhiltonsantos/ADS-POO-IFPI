public class Circulo {
    double raio;
    double pi = 3.14;

    double calculaPerimetroCirculo() {
        return 2 * pi * raio;
    }

    double calculaAreaCirculo() {
        // return pi * (raio * raio);
        return pi * Math.pow(raio, 2);
    }

}