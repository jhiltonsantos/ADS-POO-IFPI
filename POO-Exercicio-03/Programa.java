public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.depositar(1000);
        
        Conta meuSonho = new Conta();
        meuSonho.depositar(2000);

        minhaConta.transferir(meuSonho, 50);

        System.out.println(minhaConta.consultarSaldo());
        System.out.println(meuSonho.consultarSaldo());
        
    }

}