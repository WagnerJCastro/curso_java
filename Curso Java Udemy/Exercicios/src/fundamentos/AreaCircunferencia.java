package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		// É convensão de que as constantes sejam apresentadas em letras maiusculas!
		final double PI = 3.14159; // final significa que o valor da variavel é final, que não pode ser alterado
									// depois 
		double area = PI * raio * raio;

		System.out.println(area);
		
		raio = 12;
		area = PI * raio * raio;

		System.out.println("A area é " + area + "m2.");

	}

}
