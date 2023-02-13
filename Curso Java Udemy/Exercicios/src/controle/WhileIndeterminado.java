package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		//Fazer um while que continue rodando infinitamente até o usuario digitar sair!
		
		Scanner entrada = new Scanner(System.in);
		
		//System.out.println("Digite o comando: ");
		
		String comando =  ""; // entrada.nextLine().toLowerCase().trim();

		while(!comando.equals("sair")) {
		System.out.println("Digite o comando: ");
		comando = entrada.nextLine().toLowerCase().trim();
		}
		
		System.out.println("Programa encerrado!");
		
		
		
		entrada.close();
	}
}
