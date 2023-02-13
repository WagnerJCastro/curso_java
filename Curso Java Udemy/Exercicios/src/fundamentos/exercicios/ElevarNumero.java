package fundamentos.exercicios;

import java.util.Scanner;

public class ElevarNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		String numeroS = entrada.nextLine().replace(",", ".").trim();
		double numeroN = Double.parseDouble(numeroS);
		
		double quadrado = Math.pow(numeroN, 2);
		double cubo = Math.pow(numeroN, 3);
		
		System.out.printf("O numero %.2f elevado ao quadrado é %.2f e ao cubo é %.2f.", numeroN, quadrado, cubo);

		
		
		entrada.close();
	}
}
