package br;

import java.util.Random;

public class Soldado extends Personagem {

    public Soldado (int id, String nome, double energia){
        this.id = id;
        this.nome = nome;
        this.energia = energia;
    }

    @Override
    public double defenderAtaque(double ataque) {
        return super.defenderAtaque(ataque)/2;
    }

    public void atacar(Personagem personagem) {
        personagem.defenderAtaque(forcaDeAtaque());
    }

    public int forcaDeAtaque() {
        Random forca = new Random();
        return forca.nextInt(10) +1;
    }

}
