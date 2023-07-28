package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		
		int qtd_notas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.println("Informe a nota(ou -1 p/ sair): ");
			nota = input.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				total += nota;
				qtd_notas++;
			}
		}
		
		double media = total / qtd_notas;
		System.out.printf("Média = %2.d" , media);
		
		input.close();

	}

}
