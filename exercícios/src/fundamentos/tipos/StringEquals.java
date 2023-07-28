package fundamentos.tipos;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
		//Quuando for comparar strings usar o equals
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s); //false
		System.out.println("2".equals(s)); //true
		
		Scanner entrada = new Scanner(System.in); 
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); //trim tira os espaços em branco e considera só o valor 
		
		entrada.close();
		
	}

}
