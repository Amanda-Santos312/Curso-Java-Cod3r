package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4.6;
		
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultado = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		//String resultado = media >= 7.0 ? "aprovado." : media >= 5.0 ? "em recuperação" : "reprovado";
		
		System.out.println("O aluno está " + resultado);
		//System.out.printf("O aluno está  %s", resultado);

	}

}
