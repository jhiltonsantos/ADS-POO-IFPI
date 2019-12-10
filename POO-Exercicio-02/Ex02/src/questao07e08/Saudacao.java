package questao07e08;

/**
 * Saudacao
 */
public class Saudacao {

    String texto;
    String destinatario;

    public Saudacao(String texto, String destinatario) {
        this.texto = texto;
        this.destinatario = destinatario;
	}

	void obterSaudacao(){
        System.out.println(texto + ", " + destinatario + ".");
    }
}