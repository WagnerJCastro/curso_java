package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		//Desafio de adicionar apenas notas validas de 0 a 10, armazenar o total das notas, quantas notas foram
		//adicionadas e depois oferecer a média, o "sair" do programa será -1
		
Scanner entrada = new Scanner(System.in);
		
		double nota =  0;
		int quantNotas = 0;
		double total = 0;
		
		while(nota != -1) {
		System.out.println("Digite a nota (ou -1 p/ sair): ");
		nota = entrada.nextDouble();
		
		if (nota <= 10 && nota >= 0 ){
			total += nota;
			quantNotas++;	
		} else if (nota != -1) {
		System.out.println("Nota invalida...");
		}
		}
		double media = total / quantNotas;
		System.out.println("Programa encerrado!");
		
		System.out.println("Média da turma: " + media);
		
		
		
		
		entrada.close();
		}
}

