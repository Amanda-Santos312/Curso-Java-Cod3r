package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean job1 = false; //só ir mudando para testar os resultados
		boolean job2 = false;
		
		boolean comprouTV50 = job1 && job2;
		boolean comprouTV32 = job1 ^ job2;
		boolean comprouSorvete = job1 || job2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV50\"? " + comprouTV50);
		System.out.println("Comprou TV32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);

	}

}
