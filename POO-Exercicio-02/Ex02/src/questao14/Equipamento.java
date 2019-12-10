package questao14;

/**
 * Equipamento
 */
public class Equipamento {

    boolean ligado = false;

    public boolean ligar() {
        if (ligado) {
            return false;
        }
        return (ligado = true);
    }

    public boolean desligar() {
        if (ligado==false) {
            return false;
        }
        return (ligado = false);
    }

    public boolean inverter() {
        if (ligado) {
            return desligar();
        }
        return ligar();
    }

    public boolean estaLigado() {
        if (ligado) {
            return true;
        }
        return false;
    }


}