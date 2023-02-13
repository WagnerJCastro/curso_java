package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		//Desafio
		//Não usar valores numericos para controlar o laço.
		
		String valor2 = "#";
		for(String texto = "x"; texto.length() <= 5; texto += "x") {
			System.out.println(valor2);
			valor2 += "#";
		}
		
		//ou
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
		
		
		
	}

}
