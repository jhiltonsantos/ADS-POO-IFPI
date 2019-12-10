package questao13;

/**
 * testaNumberUtils
 */
public class testaNumberUtils {

    public static void main(String[] args) {
        NumberUtils n = new NumberUtils(2);

        System.out.println("Numero eh Impar: " + n.isOdd());
        System.out.println("Numero eh Par: " + n.isPair());
        System.out.println("Numero eh Primo: " + n.isPrime());
        n.printCount();
        n.printReverseCount();
    }
}