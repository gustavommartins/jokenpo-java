package jokenpo.domain;

public class Jogador {

    private final String nome;
    private Jogada jogada;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void realizaJogada(Jogada jogada) {
        this.jogada = jogada;
    }

    public String getNome() {
        return nome;
    }

    public Jogada getJogada() {
        return jogada;
    }
}
