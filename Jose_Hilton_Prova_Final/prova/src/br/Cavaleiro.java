package br;

public class Cavaleiro extends Soldado{


    public Cavaleiro(int id, String nome, double energia) {
        super(id, nome, energia);
    }

    @Override
    public void atacar(Personagem personagem) {
        personagem.defenderAtaque(forcaDeAtaque() * 2);
    }

    @Override
    public double defenderAtaque(double ataque) {
        return super.defenderAtaque(ataque)/3;
    }
}
