package br;


import java.util.Objects;

public abstract class Personagem {
    public int  id;
    public String nome;
    public double energia;

    public boolean estaVivo() {
        return !(this.energia <= 0);
    }

    public double defenderAtaque(double ataque) {
        if (this.energia > 0) {
            if (ataque < this.energia) {
                return this.energia -= ataque;
            } else {
                return this.energia = 0;
            }
        } else {
            throw new Exception("Personagem ja esta morto");
        }
    }

    public abstract void atacar(Personagem personagem);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem that = (Personagem) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", energia=" + energia +
                ", está vivo? " + estaVivo() + '\'' +
                '}';
    }
}

