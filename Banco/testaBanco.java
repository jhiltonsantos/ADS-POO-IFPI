/**
 * testaBanco
 */
public class testaBanco {

    public static void main(String[] args) {
        Banco b = new Banco(5);
        b.inserir(new Conta("1", 100.00));

        Conta c = b.consultar("1");
        
        Conta contaNova = new Conta("1", 200.00);
        b.alterar(contaNova);

        
        if (c == null) {
            System.out.println("Conta não encontrada!!!");
        }
        else {
            System.out.println("Conta: " + c.numero + " " + "Saldo: " + c.saldo);
        }

    }
}