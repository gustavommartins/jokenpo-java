import jokenpo.domain.Jogador;
import jokenpo.service.Jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Começa o jogo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Pedra, Papel e Tesoura!");

        System.out.println("Digite o nome do Jogador 1: ");
        String nomeJogador = scanner.nextLine();

        Jogador jogador = new Jogador(nomeJogador);
        Jogador computador = new Jogador("Computador");

        System.out.println("Bem-vindo " + nomeJogador + "! Vamos começar o jogo.");
        System.out.println("Você jogará contra o Computador.");

        Jogo jogo = new Jogo(jogador, computador);

        jogo.iniciar();

    }
}