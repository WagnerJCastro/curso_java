package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		//Pedir para o usuario qual a operação que ele quer fazer + - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro numero:");
		double num1 = entrada.nextDouble();
		
		System.out.print("Insira o segundo numero:");
		double num2 = entrada.nextDouble();
		
		System.out.print("Insira a operação:");
		String op = entrada.next();
		
		//logica
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
	
		
		
		
		entrada.close();
		
	}

}
