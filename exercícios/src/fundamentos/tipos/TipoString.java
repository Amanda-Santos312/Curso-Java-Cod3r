package fundamentos.tipos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); //verifica se começa com
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.endsWith("tarde")); //verifica se termina com
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12334.987;
		
		String frase = ("Nome: " + nome + 
				"\nSobrenome: " + sobrenome +
				"\nIdade: " + idade +
				"\nSalario: " + salario);
		System.out.println(frase);
		
		System.out.printf("O Sr. %s %s tem %d e ganha %.2f.", 
				nome, sobrenome, idade, salario); //%s - stings, %d - inteiros, %f - flutuante
		//outra forma:
		String outra_frase = String.format("\nO Sr. %s %s tem %d e ganha %.2f.", 
				nome, sobrenome, idade, salario);
		System.out.println(outra_frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
}
