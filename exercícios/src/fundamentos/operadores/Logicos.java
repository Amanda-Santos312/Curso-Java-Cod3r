package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean cond1 = true;
		boolean cond2 = 3 > 7;
		
		System.out.println(cond1 && cond2); //com !cond2 fica true 
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(!cond1); //com dois !! fica true
		System.out.println(!cond2);
		
		System.out.println("\n");
		System.out.println("Tabela Verdade do E:");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("\n");
		System.out.println("Tabela Verdade do OU:");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\n");
		System.out.println("Tabela Verdade do XOR:");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\n");
		System.out.println("Tabela Verdade do NOT:");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
