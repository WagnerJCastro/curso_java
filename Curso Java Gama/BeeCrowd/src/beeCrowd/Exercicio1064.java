package beeCrowd;

import java.util.Scanner;

public class Exercicio1064 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numLimite = 0;
		double numDigitado = 0;
		int qtdNumeros = 0;
		double total = 0;
		
		do {
			numDigitado = teclado.nextDouble();
			if (numDigitado >= 0) {
				qtdNumeros++;
				total = total + numDigitado;
			}
			numLimite++;
		} while(numLimite <= 5);
		
		double media = total / qtdNumeros;
		
		
		System.out.println(qtdNumeros + " valores positivos");
		System.out.printf("%.1f\n", media);
		teclado.close();	
	}
}
