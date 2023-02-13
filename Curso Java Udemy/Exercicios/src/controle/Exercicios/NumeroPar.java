package controle.Exercicios;

import java.util.Scanner;

public class NumeroPar {
	
	public static void main(String[] args) {
		//Crie um programa que receba um numero e verifique se ele está entre 0 e 10 e é par.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o numero: ");
			
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10 ) {
			System.out.println("O numero " + numero + " está entre 0 e 10");
		} else 
			System.out.println("O numero " + numero + " não está entre 0 e 10");
		double par = numero % 2;
		if(par == 1) {
			System.out.println("E é impar!");
		} else 
			System.out.println("E é par!");
		
		entrada.close();
	}

}
