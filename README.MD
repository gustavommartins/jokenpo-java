# Jokenpo

Implementação do clássico jogo Pedra, Papel e Tesoura (Jokenpo) em Java.

## Estrutura do Projeto

```
Jokenpo.iml
README.MD
src/
  Main.java
  jokenpo/
    domain/
      Jogada.java
      Jogador.java
      Placar.java
    service/
      Jogo.java
```

- **Main.java**: Ponto de entrada da aplicação.
- **jokenpo/domain/**: Contém as classes de domínio do jogo (Jogada, Jogador, Placar).
- **jokenpo/service/**: Lógica principal do jogo (Jogo.java).

## Como Executar

1. Certifique-se de ter o Java instalado (JDK 8 ou superior).
2. Compile os arquivos:
   ```
   javac src/Main.java
   ```
3. Execute o programa:
   ```
   java -cp src Main
   ```

## Classes Principais

- **Jogada.java**: Representa uma jogada (pedra, papel ou tesoura).
- **Jogador.java**: Representa um jogador do jogo.
- **Placar.java**: Gerencia o placar das partidas.
- **Jogo.java**: Controla a lógica do jogo, regras e fluxo das partidas.

## Requisitos
- Java JDK 8 ou superior

## Autor
- Projeto pessoal desenvolvido por Gustavo Martins.

## Licença
Este projeto é de uso pessoal e livre para estudos.

