package br;

public class testJogo {
    public static void main(String[] args) {
        Soldado soldado1 = new Soldado(1,"jose",60.0);
        Soldado soldado2 = new Soldado(2,"hilton", 50.0);
        Cavaleiro caveleiro1 = new Cavaleiro(3, "silva", 70.0);

        Jogo jogo = new Jogo();

        jogo.incluir(soldado1);
        jogo.incluir(soldado2);
        jogo.incluir(caveleiro1);

        jogo.atacar(soldado1, soldado2);
        jogo.atacar(soldado2, caveleiro1);
        jogo.atacar(caveleiro1, soldado1);

        jogo.avaliarBatalha();

    }


}
