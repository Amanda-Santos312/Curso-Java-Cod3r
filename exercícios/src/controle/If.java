package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a Média: ");
		double media = entrada.nextDouble();
		
		if (media >= 7.0 && media <= 10) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!!!");
			
		}else if (media >= 4.5 && media < 7) {
			System.out.println("Recuperação");
			
		}else if (media >= 0 && media < 4.5) {
			System.out.println("Reprovado");
			
		}
		
		entrada.close();
	}

}
