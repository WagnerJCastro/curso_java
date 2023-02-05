package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		//Trabalho na terça		(V ou F)
		//Trabalho na quinta	(V ou F)
		
		//Se os dois trabalhos ocorrerem você vai comprar uma televisão de 50'
		//Se um só trabalho ocorrer você vai comprar uma televisão de 32'
		//Se você comprar uma TV vai levar a familia para tomar sorvete.
		//Se não tomar sorvete apresente a opção "mais saudavel"
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Você trabalhou na terça? (S/N): ");
		String terca = entrada.nextLine().toLowerCase().replace("s", "true").replace("n", "false");
		
		System.out.print("Você trabalhou na quinta? (S/N): ");
		String quinta = entrada.nextLine().toLowerCase().replace("s", "true").replace("n", "false");
		
		boolean tercaboo = Boolean.parseBoolean(terca);
		boolean quintaboo = Boolean.parseBoolean(quinta);
	
		boolean comprouTv50 = tercaboo && quintaboo;
		boolean comprouTv32 = tercaboo ^ quintaboo;
		boolean comprouSorvete = tercaboo || quintaboo;
		
		System.out.println("Comprou Tv de 50\'?" + comprouTv50);
		System.out.println("Comprou Tv de 32\'?" + comprouTv32);
		System.out.println("Comprou sorvete\'?" + comprouSorvete);
		
		//Operador unario
		System.out.println("Mais saudavel\'?" + !comprouSorvete);
		
		
		
		
//		System.out.println(terca + quinta);
//		System.out.println(tercaboo);
//		System.out.println(quintaboo);
		
				
		
		
		
		
		
		entrada.close();
		
	}

	
}
