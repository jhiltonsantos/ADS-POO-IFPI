package questao12;

/**
 * testaDesconto
 */
public class testaDesconto {

    public static void main(String[] args) {
        Desconto des = new Desconto(120, 10);

        System.out.println("Valor de desconto: " + des.calcula());
    }
}