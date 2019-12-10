/**
 * banco
 */
public class Banco {

    Conta[] contas;
    int indice = 0;

    public Banco(int tamanho) {
        contas = new Conta[tamanho];
    }

    void inserir(Conta c) {
        contas[indice] = c;
        indice++;
    }

    Conta consultar(String numero) {
        Conta contaRetorno = null;

        for (int i = 0; i < indice; i++){
            Conta conta = contas[i];
            if (conta.numero.equals(numero)) {
                contaRetorno = conta;
                break;
                //return conta;
            }
        }

        return contaRetorno;
        //return null;
    }

    void alterar (Conta c) {
        Conta contaAlterar = consultar(c.numero);
        if(contaAlterar != null) {
            contaAlterar.saldo = c.saldo;
        }
    }
}