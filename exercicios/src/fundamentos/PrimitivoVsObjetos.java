package fundamentos;

public class PrimitivoVsObjetos {

	public static void main(String[] args) {
		//Tudo em Java é objeto exceto os tipos primitivos
		
		String s = "texto";
		//duas maneiras de se definir uma String
		String x = new String("texto2");
		// os dois textos são objetos
		
		// Wrappers são a versão objeto dos tipos primitivos
		
		System.out.println(x + s);

	}

}
