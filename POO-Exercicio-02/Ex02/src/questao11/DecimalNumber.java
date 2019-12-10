package questao11;

/**
 * DecimalNumber
 */
public class DecimalNumber {

    double number;

    public DecimalNumber(double number) {
        this.number = number;
    }

    public int numberWInterger() {
        return (int) (number);
    }

    public double numberWDecimal() {
        return (number) % (int) (number);
    } 


}