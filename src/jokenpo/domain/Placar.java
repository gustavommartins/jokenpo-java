package jokenpo.domain;

public class Placar {

    private int vitoriasJogador1;
    private int vitoriasJogador2;
    private int empates;

    public Placar() {
        this.vitoriasJogador1 = 0;
        this.vitoriasJogador2 = 0;
        this.empates = 0;
    }

    public void registrarVitoriaJogador1() {
        vitoriasJogador1++;
    }

    public void registrarVitoriaJogador2() {
        vitoriasJogador2++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public int getVitoriasJogador1() {
        return vitoriasJogador1;
    }

    public int getVitoriasJogador2() {
        return vitoriasJogador2;
    }

    public int getEmpates() {
        return empates;
    }

}
