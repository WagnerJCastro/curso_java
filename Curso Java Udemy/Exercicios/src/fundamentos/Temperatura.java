package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// atividade transforme a temperatuda de fahrenheit para celsius
		// (ºF - 32) x 5/9 = ºC
		
		double fahrenheit = 86;
		final double subtracao = 32;
		final double divisao = 5.0/9.0;
		double celsius = (fahrenheit - subtracao) * divisao;
		
				System.out.println("O resultado é " + celsius +"ºC.");
		
		fahrenheit = 120;
		celsius = (fahrenheit - subtracao) * divisao;
		
				System.out.println("O resultado é " + celsius +"ºC.");
	}
}
