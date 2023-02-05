package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		//if(...) {}
		//while(...){}
		//for(...; ...; ...) {}
		
		//do{} while(...);
		
		//A estrutura do while será executada pelo menos 1 vez, enquanto as outras só irão executar caso 
		//o requisito esteja valido.
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras magicas...");
			System.err.println("Quer sair?");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		
		
		entrada.close();
		
	}

}
