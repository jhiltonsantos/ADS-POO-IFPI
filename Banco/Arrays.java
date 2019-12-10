/**
 * Arrays
 */
public class Arrays {

    public static void main(String[] args) {
        Conta c1 = new Conta("1", 1000);
        Conta[] banco = new Conta[10];
        banco[0] = c1;
        System.out.println(banco[0].numero + " " + banco[0]); 
    }
}