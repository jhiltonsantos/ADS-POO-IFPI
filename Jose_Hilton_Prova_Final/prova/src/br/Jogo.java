package br;

import java.util.ArrayList;


public class Jogo {
    ArrayList<Personagem> personagens = new ArrayList<Personagem>();

    public boolean verificarID(int indentificacao) {
        boolean verifica = false;
        for (Personagem personagen : personagens) {
            if (personagen.id == indentificacao) {
                return true;
            }
        }
        return verifica;
    }

    public void incluir(Personagem p) {
        if (verificarID(p.id)) {
            throw new Exception("Personagem ja adicionado");
        }
        else {
            personagens.add(p);
        }
    }

    public Personagem consultar(Personagem p) {
        Personagem retorno = null;
        if (personagens.contains(p)) {
            int id = personagens.indexOf(p);
            retorno = personagens.get(id);
        }
        return retorno;
    }

    public void atacar(Personagem p1, Personagem p2) {
        //Personagem p1 = null;
        //assert false;
        //p1.id = idP1;
        //Personagem p2 = null;
        //p2.id = idP2;

        p1 = consultar(p1);
        p2 = consultar(p2);

        if (p1 == p2){
            throw new Exception("Personagens iguais");
        }
        if (p1 == null || p2 == null) {
            throw new Exception("Personagem não existe");
        }
        p1.atacar(p2);
    }

    public void avaliarBatalha (){
        for (Personagem p : personagens) {
            System.out.println(p.toString());
        }

    }
}
