package controle;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("N: ");
        int n = input.nextInt();

        int contador = 1;

        while (contador <= n) {
            System.out.println(contador);
            contador++;
        }

        input.close();

	}

}
