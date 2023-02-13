package beeCrowd;

import java.util.Scanner;

public class Exercicio1066 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numLimite = 0;
		int numDigitado = 0;
		int positivo = 0;
		int negativo = 0;
		int par = 0;
		int impar = 0;
		
		
		do {
			numDigitado = teclado.nextInt();
			if ((numDigitado % 2) == 0) {
				par++;
			} else {
				impar ++;
			}
			if (numDigitado < 0) {
				negativo++;
			}else if (numDigitado > 0) {
				 positivo++;
			}
				numLimite++;
		} while(numLimite <= 4);
		
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		
		teclado.close();	
		
	}

}
