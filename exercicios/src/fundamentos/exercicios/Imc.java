package fundamentos.exercicios;

import java.util.Scanner;

public class Imc {
	
	public static void main(String[] args) {
		//Calcular o IMC e apresentar a situação do usuario
		//Peso / (altura)2 = IMC
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual sua altura? ");
		String alturaS = entrada.nextLine().replace(",", ".").trim();
		
		System.out.print("Qual seu peso? ");
		String pesoS = entrada.nextLine().replace(",", ".").trim();
		
		double alturaN = Double.parseDouble(alturaS);
		double pesoN = Double.parseDouble(pesoS);
		
		double imc = pesoN / (Math.pow(alturaN , 2));
		
		String condicao = imc <= 18.4 ? "Magreza." : imc <= 24.9 ? "Normal." : imc <= 29.9 ? "Sobrepeso" 
				: imc <= 39.9 ? "Obesidade." : "Obesidade Grave.";
		
		System.out.printf("Seu IMC é: %.2f. e sua condição é de %s", imc, condicao );
		
		entrada.close();
	}

}
