package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//Forma pós fixada.
		a++; // a = a + 1
		a--; // a = a - 1
		
		// Forma pré fixada, 
		++b; // b = b + 1
		--b; // b = b - 1
		
		
		//A operação pré fixada tem maior precedencia, é feita primeiro que as outras operações
		//Enquanto a pós fixada tem menor precedencia, é feita depois das outras operações.
		// No caso aqui a conta que ele fará será (a+1) + b, que seria (1+1) + 2, totalizando 4
		// E só depois de apresentar o resultado ele irá realizar a operação b--
		System.out.println(++a + b--);
		System.out.println(b);
		
		
	}

}
