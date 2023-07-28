package fundamentos.tipos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Salário1: ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.println("\nSalário2: ");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.println("\nSalário3: ");
		String salario3 = entrada.next().replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double soma = s1 + s2 + s3;
		double media = soma / 3;
		
		System.out.println("\nSoma dos Salários: " + soma);
		System.out.println("Média: " + media);
		
		entrada.close();
	}

}
