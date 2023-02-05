package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "bom dia X";
		// É possivel utilizar operador ponto "." para abrir opções de funcionalidade que pode ser feito.
		s.toUpperCase(); // Esse comando irá deixar a string "s" maiuscula, mas apenas para essa linha
		s = s.toUpperCase(); // Para alterar a variavel "s" para as modificações é preciso definir ela com =
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Wag".toUpperCase();
		System.out.println(x);
		
		System.out.println("Wagnão".toUpperCase());
		
		// Tambem pode ser feito em diversas linhas
		String y = "Batatinha quando dorme"
				.replace("dorme", "nasce")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		
				
	}

}
