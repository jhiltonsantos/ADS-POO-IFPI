package questao11;

/**
 * testaDecimalNumber
 */
public class testaDecimalNumber {

    public static void main(String[] args) {
        DecimalNumber d = new DecimalNumber(5.25);

        System.out.println("Valor inteiro: " + d.numberWInterger());
        System.out.println("Valor Decimal: " + d.numberWDecimal());
    }
}