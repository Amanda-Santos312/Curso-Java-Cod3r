package fundamentos.tipos;

public class ConversaoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //implícita
		System.out.println(a);
		
		//explícita
		float b = (float) 1.12345; //diz ao java que pode converter o valor para float.
		System.out.println(b);
		
		int c = 340; //java analisa os tipos e não os valores
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}

}
