package beeCrowd;

import java.util.Scanner;

public class Exercicio1038 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qtd, cod;
		double total, cachorro, salada, bacon, torrada, refri;
		cod = teclado.nextInt();
		qtd = teclado.nextInt();
		cachorro = 4.00;
		salada = 4.50;
		bacon = 5.00;
		torrada = 2.00;
		refri = 1.50;
		
		if (cod == 1) {
			total = qtd * cachorro;
			System.out.printf("Total: R$ %.2f\n", total);
		} else if (cod == 2) {
			total = qtd * salada;
			System.out.printf("Total: R$ %.2f\n", total);
		} else if (cod == 3) {
			total = qtd * bacon;
			System.out.printf("Total: R$ %.2f\n", total);
		} else if (cod == 4) {
			total = qtd * torrada;
			System.out.printf("Total: R$ %.2f\n", total);
		} else {
			total = qtd * refri;
			System.out.printf("Total: R$ %.2f\n", total);
		} 
	}
	
}
