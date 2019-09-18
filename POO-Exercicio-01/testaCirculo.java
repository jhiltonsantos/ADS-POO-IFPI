public class testaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.raio = 3;

        System.out.println(circulo.calculaPerimetroCirculo());
        System.out.println(circulo.calculaAreaCirculo());
    }

}