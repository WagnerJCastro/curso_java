package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		boolean condicao3 = 3 > 7;
		// O comando ! apresenta o valor contrario, por exemplo:
		System.out.println(!condicao3);
		
		// Condição1 E condição2 são verdadeiros?
		System.out.println(condicao1 && condicao2);
		
		// Condição1 OU condição2 são verdadeiros?
		System.out.println(condicao1 || condicao2);
		
		// Condição OU EXCLUSIVO (apenas um pode ser true) são verdadeiros?
		System.out.println(condicao1 ^ condicao2);
		
		//Proximos comentarios apenas para não ficar notificação de codigo morto
		
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (OR)");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		
		
		
		
		
	}

}
