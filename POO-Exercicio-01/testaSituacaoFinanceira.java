public class testaSituacaoFinanceira {

    public static void main(String[] args) {
        SituacaoFinanceira financeira = new SituacaoFinanceira();

        financeira.valorCreditos = 500;
        financeira.valorDebitos = 300;

        System.out.println(financeira.calculaSaldo());

    }
}