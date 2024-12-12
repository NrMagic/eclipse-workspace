package jogo;
import java.util.Scanner;

public class jogodavelha {


	    public static char[][] tabuleiro = new char[3][3];
	    public static char jogadorAtual = 'X';  // Começa com o jogador X

	    // Função para inicializar o tabuleiro
	    public static void inicializarTabuleiro() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tabuleiro[i][j] = ' '; // Espaço vazio para indicar que a célula está disponível
	            }
	        }
	    }

	    // Função para imprimir o tabuleiro
	    public static void imprimirTabuleiro() {
	        System.out.println("-----------");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(tabuleiro[i][j] + " | ");
	            }
	            System.out.println();
	            System.out.println("-----------");
	        }
	    }

	    // Função para verificar se houve vitória
	    public static boolean verificarVitoria() {
	        // Verificar linhas, colunas e diagonais
	        for (int i = 0; i < 3; i++) {
	            // Verificar linhas
	            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
	                return true;
	            }
	            // Verificar colunas
	            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
	                return true;
	            }
	        }
	        // Verificar diagonais
	        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
	            return true;
	        }
	        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
	            return true;
	        }

	        return false;
	    }

	    // Função para verificar se o tabuleiro está cheio (empate)
	    public static boolean verificarEmpate() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (tabuleiro[i][j] == ' ') {
	                    return false; // Se houver um espaço vazio, o jogo ainda pode continuar
	                }
	            }
	        }
	        return true; // Se não houver mais espaços vazios, é empate
	    }

	    // Função para jogar uma rodada
	    public static void jogarRodada(Scanner scanner) {
	        int linha, coluna;

	        // Solicitar a jogada do jogador
	        System.out.println("Jogador " + jogadorAtual + ", é a sua vez!");
	        System.out.print("Informe a linha (0, 1 ou 2): ");
	        linha = scanner.nextInt();
	        System.out.print("Informe a coluna (0, 1 ou 2): ");
	        coluna = scanner.nextInt();

	        // Verificar se a posição está vazia
	        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
	            tabuleiro[linha][coluna] = jogadorAtual; // Coloca o símbolo do jogador na posição escolhida
	        } else {
	            System.out.println("Posição inválida ou já ocupada! Tente novamente.");
	            jogarRodada(scanner); // Repete o turno se a jogada for inválida
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        inicializarTabuleiro();
	        imprimirTabuleiro();

	        while (true) {
	            jogarRodada(scanner);
	            imprimirTabuleiro();

	            if (verificarVitoria()) {
	                System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
	                break;
	            }

	            if (verificarEmpate()) {
	                System.out.println("Empate! O jogo terminou sem vencedores.");
	                break;
	            }

	            // Alternar o jogador
	            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
	        }

	        scanner.close();
	    }
	}


