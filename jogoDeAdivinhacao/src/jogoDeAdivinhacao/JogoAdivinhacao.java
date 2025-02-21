package jogoDeAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100) + 1;
		int tentativa;
		int tentativas = 0;
		
		System.out.println("=== Jogo de Adivinhação ===");
		System.out.println("Tente adivinhar o número entre 1 e 100!");
		
		do {
			System.out.println("\nDigite seu palpite: ");
			tentativa = entrada.nextInt();
			tentativas++;
			
			if(tentativa > numeroAleatorio) {
				System.out.println("\nO número aleatório é menor do que o número digitado. Tente novamente!");
			} else if (tentativa < numeroAleatorio) {
				System.out.println("\nO número aleatório é maior do que o número digitado. Tente novamente!");				
			} else {
				System.out.println("\nParabéns, você acertou em " + tentativas + " tentativas.");
			}
		} while(tentativa != numeroAleatorio);
		
		entrada.close();
	}
}
