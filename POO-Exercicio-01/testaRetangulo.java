public class testaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.l1 = 20;
        retangulo.l2 = 10;

        System.out.println(retangulo.calculaArea());
        System.out.println(retangulo.calculaPerimetro());

    }

}