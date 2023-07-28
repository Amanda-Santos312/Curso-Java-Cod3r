package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		//variáveis: tipo / nome / valor
		int raio = 3;
		
		final double PI = 3.14; //final - o valo não poderá ser mudado posteriormente no bloco;
		//para indicar que é uma constante o nome pode ser em letras maiúsculas; pi -> PI;
		
		double area = PI * raio * raio;
		
		System.out.println(raio);
		System.out.println(PI);
		System.out.println("Área é igual a " + area + " m²");
		
	}
}