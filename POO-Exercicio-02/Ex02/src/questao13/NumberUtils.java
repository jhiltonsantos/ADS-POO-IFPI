package questao13;

/**
 * NumberUtils
 */
public class NumberUtils {

    int n;

    public NumberUtils(int n) {
        this.n = n;
    }

    public boolean isPair() {
        if (n%2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        if (n % 2 == 0) {
            return false;
        }
        return true;
    }

    public boolean isPrime() {
        if (n == 0 || n == 1) {
            return false;
        }
        else {
            if (n == 2) {
                return true;
            }
            else {
                for (int i=2; i<=n; i++) {
                    int mod = n%i;
                    if ((mod == 0)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void printCount() {
        for (int i=0; i<=n; i++) {
            System.out.println(i);
        }
    }

    public void printReverseCount() {
        for (int i=n; i>=0; i--) {
            System.out.println(i);
        }
    }

}