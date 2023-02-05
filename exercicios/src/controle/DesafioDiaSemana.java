package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
	//Desafio: O usuario precisa digitar um dia da semana e o programa irá retornar um numero para cada dia.
	//Seguindo a sequencia de domingo ser um até sabado ser 7
		
	

	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o nome do dia: ");
	
	String dia = entrada.nextLine().toLowerCase().trim().replace("ç", "c").replace("á", "a");
	
	if(dia.equals("domingo")) {
		System.out.println("1");
	} else if (dia.equals("segunda")) {
		System.out.println("2");
	} else if (dia.equals("terca")) {
		System.out.println("3");
	} else if (dia.equals("quarta")) {
		System.out.println("4");
	} else if (dia.equals("quinta")) {
		System.out.println("5");
	} else if (dia.equals("sexta")) {
		System.out.println("6");
	} else if (dia.equals("sabado")) {
		System.out.println("6");
	} else {
		System.out.println("Dia invalido, tente novamente");
	}
	
	//Outra opção ao inves de usar os comandos de tratamento na entrada da string tbm pode usar:
	
	if("domingo".equalsIgnoreCase(dia)) {
		System.out.println("1");
	}
	//e
	else if ("terca".equalsIgnoreCase(dia)
		|| "terça".equalsIgnoreCase(dia)) {
		System.out.println("3");
	}
	
	entrada.close();
}
}
