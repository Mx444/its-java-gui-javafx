package lezione_10.esercizio_1;

public class Studente {
    private String nome;
    private String cognome;
    private int voto;

    public Studente(String nome, String cognome, int voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getVoto() {
        return this.voto;
    }

}