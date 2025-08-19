package jokenpo.service;

import jokenpo.domain.Jogada;
import jokenpo.domain.Jogador;
import jokenpo.domain.Placar;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    private final Jogador jogador1;
    private final Jogador jogador2;
    private final Placar placar;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.placar = new Placar();
    }

    public void iniciar(Scanner scanner) {
        try {
            System.out.println("Partida iniciada! Escolha sua jogada.\n");
            System.out.println("Digite a jogada (PEDRA, PAPEL ou TESOURA): ");
            String jogadaInput = scanner.nextLine().toUpperCase();

            geraJogadaDoJogador(jogadaInput);
            geraJogadaAleatoriaDoComputador();

            System.out.println("Sua jogada foi: " + this.jogador1.getJogada().name() + "\n");
            Thread.sleep(1000); // Pausa para suspense
            System.out.println("O computador está pensando...\n");
            Thread.sleep(1000); // Pausa para suspense
            System.out.println("Computador escolheu: " + this.jogador2.getJogada().name()+ "\n");

            System.out.println("Verificando o resultado...\n");

            Thread.sleep(1000); // Pausa para suspense
            // Verifica o resultado
            verificarVencedor();

            Thread.sleep(1000);
            System.out.println("\nPlacar atual:");
            System.out.println("Vitórias do Jogador 1: " + placar.getVitoriasJogador1());
            System.out.println("Vitórias do Jogador 2: " + placar.getVitoriasJogador2());
            System.out.println("Empates: " + placar.getEmpates());

        } catch (IllegalArgumentException e) {
            System.out.println("jokenpo.domain.Jogada inválida! Por favor, escolha entre PEDRA, PAPEL ou TESOURA.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void geraJogadaDoJogador(String jogadaInput) {
        this.jogador1.realizaJogada(Jogada.valueOf(jogadaInput));
    }

    private void geraJogadaAleatoriaDoComputador() {
        Jogada[] jogadaValues = Jogada.values();
        Jogada jogadaAleatoria = jogadaValues[new Random().nextInt(jogadaValues.length)];
        this.jogador2.realizaJogada(jogadaAleatoria);
    }

    private void verificarVencedor() {
        if(this.jogador1.getJogada() == this.jogador2.getJogada()){
            System.out.println("Deu empate! Ambos escolheram " + this.jogador1.getJogada());
            this.placar.registrarEmpate();
        } else if (this.jogador1.getJogada().venceDe(this.jogador2.getJogada())) {
            System.out.println("Parabéns " + this.jogador1.getNome() + ", você venceu!");
            this.placar.registrarVitoriaJogador1();
        } else {
            System.out.println("O computador venceu!");
            this.placar.registrarVitoriaJogador2();
        }
    }

}
