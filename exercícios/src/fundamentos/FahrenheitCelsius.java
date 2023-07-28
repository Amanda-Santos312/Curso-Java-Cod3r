package fundamentos;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		double fahrenheit = 96;
		double celsius = (fahrenheit - 32) * 5/9;
		
		System.out.printf("%.2f", celsius); //qtd de casas decimais

	}
}