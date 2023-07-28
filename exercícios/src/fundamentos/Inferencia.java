package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; 
		/*inferência é:
		 *não informar o tipo pois o java irá inferir de acordo com o valor da variável*/
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; //variável foi declarada
		d = 123.65; //variável foi inicializada
		System.out.println(d); //usada
		
		//var e; //erro pq na hora que declarar assim, tem que ser inicializada
		//e = 123.45;
		
		var e = 123.45; //o certo é assim
		System.out.println(e);
		
		var f = 12; //inteiro
		//f = 12.01; 
		System.out.println(f);
	}

}
