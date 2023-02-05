package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		// É possivel criar variavel sem definir o tipo dela com "var" e o Java irá
		// especificar um tipo dependendo do valor que você der a variavel

		// Lembrando que você não pode mudar o tipo da variavel em atualizações futuras!
		var a = "texto";
		System.out.println(a);
		//a = 12; Não é possivel mudar de sting para int

		var b = 4.5;
		System.out.println(b);
		b = 12;
		System.out.println(b); // É aceita essa mudança mas não irá imprimir o numero int "12" e sim o double
								// "12.0"

		var c = 12;
		System.out.println(c);
		// c = 4.5; Não é aceito a mudança de int para double
		
		double d; // Declaração da variavel
		d = 123.65; // Inicialização da variavel
		System.out.println(d);
		
		// Não é possivel declarar e inicializar a variavel "var" em linhas separadas

	}
}
