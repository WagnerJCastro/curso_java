package fundamentos.operadores;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		
		var x = 32.20;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
		// Para elevar um numero se usa:
		//Math.pow(Numero, elevado a)
		double a = Math.pow(3, 2);
		System.out.println(a);
		
		System.out.println(12 % 5);
	}

}
