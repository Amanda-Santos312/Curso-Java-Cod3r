package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Num1: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Num2: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		String op = entrada.next();
		
		double result = "+".equals(op) ? num1 + num2 : 0;
		result = "-".equals(op) ? num1 - num2 : result;
		result = "*".equals(op) ? num1 * num2 : result;
		result = "/".equals(op) ? num1 / num2 : result;
		result = "%".equals(op) ? num1 % num2 : result;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, result);
		
		entrada.close();

	}

}
