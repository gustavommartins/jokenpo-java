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

        boolean iscontinuarJogo = true;
        while (iscontinuarJogo) {
            jogo.iniciar(scanner);
            System.out.println("\nDeseja jogar novamente? (s/n)");
            String resposta = scanner.nextLine().trim().toLowerCase();
            iscontinuarJogo = isProximaPartida(resposta, scanner);
        }
    }

    private static boolean isProximaPartida(String resposta, Scanner scanner) {
        boolean isProxima;
        switch (resposta) {
            case "s" -> {
                System.out.println("Iniciando uma nova partida...");
                isProxima = true;
            }
            case "n" -> {
                System.out.println("Obrigado por jogar! Até a próxima!");
                isProxima = false;
            }
            default -> {
                System.out.println("Resposta inválida! Por favor, digite 's' para sim ou 'n' para não.");
                String novaResposta = scanner.nextLine().trim().toLowerCase();
                return isProximaPartida(novaResposta, scanner);
            }
        }
        return isProxima;
    }


}