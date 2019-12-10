package questao12;

/**
 * Desconto
 */
public class Desconto {

    double valorOriginal;
    double percentualDesconto;

    public Desconto(double valorOriginal, double percentualDesconto) {
        this.valorOriginal = valorOriginal;
        this.percentualDesconto = percentualDesconto;
    }

    public double calcula() {
        return (valorOriginal * (1 - percentualDesconto/100));
    }
}