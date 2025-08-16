import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Começa o jogo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo Pedra, Papel e Tesoura!");
        System.out.print("Digite o nome do Jogador 1: ");
        String nomeJogador = scanner.nextLine();

        Jogador jogador = new Jogador(nomeJogador);

        System.out.print("Digite a jogada (PEDRA, PAPEL ou TESOURA): ");
        String jogadaInput = scanner.nextLine().toUpperCase();

        Jogador computador = new Jogador("Computador");

        try {
            Jogada jogada = Jogada.valueOf(jogadaInput);
            jogador.realizaJogada(jogada);
            Jogada jogadaJogador = jogador.getJogada();
            System.out.println("Jogada realizada: " + jogadaJogador);
            System.out.println("Jogador: " + jogador.getNome() + " escolheu " + jogadaJogador);

            // Simula a jogada do computador
            Jogada[] jogadaValues = Jogada.values();
            Jogada jogadaAleatoria = jogadaValues[new Random().nextInt(jogadaValues.length)];
            computador.realizaJogada(jogadaAleatoria);
            Jogada jogadaComputador = computador.getJogada();
            System.out.println("Computador escolheu: " + jogadaComputador);
            // Verifica o resultado
            if(jogadaJogador == jogadaComputador){
                System.out.println("Deu empate! Ambos escolheram " + jogadaJogador);
            } else if (jogadaJogador.venceDe(jogadaComputador)) {
                System.out.println("Parabéns " + jogador.getNome() + ", você venceu!");
            } else {
                System.out.println("O computador venceu! " + jogadaComputador + " vence " + jogadaJogador);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Jogada inválida! Por favor, escolha entre PEDRA, PAPEL ou TESOURA.");
        }
    }
}