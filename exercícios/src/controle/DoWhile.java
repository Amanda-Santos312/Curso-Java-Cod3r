package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//Entrada:
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		//Processamento:
		do {
			System.out.println("Você precisa falar "
					+ "as palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		//Saída:
		System.out.println("Obrigada!");
		
		entrada.close();

	}

}
