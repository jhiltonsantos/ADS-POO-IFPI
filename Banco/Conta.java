/**
 * Conta
 */
public class Conta {
    String numero;
    double saldo;

    public Conta(String numero, double saldo) {
        this.saldo = saldo;
        this.numero = numero;
    }

    void debitar(double valor) {
        saldo = saldo - valor;
    }

    void creditar(double valor) {
        saldo = saldo + valor;
    }

    double transferir(){
        return 0;
    }

    double consultarSaldo() {
        return saldo;
    }
    
}