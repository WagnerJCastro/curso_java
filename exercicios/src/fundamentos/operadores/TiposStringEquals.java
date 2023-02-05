package fundamentos.operadores;

import java.util.Scanner;

public class TiposStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		
		//Para comparar Strings é usado o .equals e ele irá comparar o conteudo
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2); //Mesmo que seja digitado 2 não será reconhecido como true
		System.out.println("2".equals(s2.trim())); //Trim para que se exista espaços digitados ele remova-os
		
		
		entrada.close();
		
	}

}
