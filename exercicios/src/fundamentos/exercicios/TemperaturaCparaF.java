package fundamentos.exercicios;

public class TemperaturaCparaF {
	
	public static void main(String[] args) {
		// atividade transforme a temperatuda de celsius para fahrenheit
		//(°C x 1,8) + 32 = F
		
		double celsius = 29;
		final double multiplicacao = 1.8;
		final double soma = 32;
		double fahrenheit = (celsius * multiplicacao) + soma;
		
				System.out.println("O resultado é " + fahrenheit +"ºF.");


	}
	
	
}
