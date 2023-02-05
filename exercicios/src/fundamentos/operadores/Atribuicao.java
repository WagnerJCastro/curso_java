package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		
		c = c + b;  
		//É possivel fazer isso de uma maneira menor, por exemplo:
		c += b;		// c = c + b;
		c -= b;		// c = c - b;
		c *= b;		// c = c * b;
		c /= b;		// c = c / b;
		c /= b;		// c = c % b;
		
		//Operador unario de encremento
		
		c++;		//c = c + 1;
		
		
		
		
		
		
	}

}
