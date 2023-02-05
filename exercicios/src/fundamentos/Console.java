package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
	
		System.out.print("Bom dia\n"); 
		
		//O padrão de system out é a tela e o padrão de system in é o teclado, mas é possivel outras opções
		Scanner entrada = new Scanner(System.in);
		
		//nextLine quando for String
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		//nextInt quando for int
		//next... quando for outros modelos
		//O nextInt só lê numeros, quando digitamos e apertamos enter para validar a entrada
		//ele não reconheçe, e deixa um \n para tras que é como é reconhecido o enter, assim
		//o proximo leitor de texto vai reconhecer o \n deixado para tras e irá pular uma linha
		//encerrando uma pergunta como no exemplo: profissão
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		//Para resolver esse problema podemos adicionar o comando o seguinte comando
		entrada.nextLine();


		System.out.print("Digite a sua profissão: ");
		String profissao = entrada.nextLine();
		
		
		
		System.out.println("\n\nNome: " + nome + " " + sobrenome);
		
		//Tambem é possivel usar "%n" para pular uma linha
		System.out.printf("%s %s tem %d anos e é %s. %n", nome, sobrenome, idade, profissao);
		
		
		// É recomendado fechar os arquivos ou comandos adicionais para economizar recursos
		entrada.close();

	}

}
