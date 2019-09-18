public class SituacaoFinanceira {

    double valorCreditos;
    double valorDebitos;

    double calculaSaldo() {
        return (valorCreditos - valorDebitos);
    }

}