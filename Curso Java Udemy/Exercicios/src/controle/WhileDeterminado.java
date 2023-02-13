package controle;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 10) {
		System.out.printf("i = %d\n", contador);
		contador++;
		}
		
		int contador2 = 1;
		
		while(contador2 <= 10) {
		System.out.printf("i = %d\n", contador2);
		contador2 += 2;
		}
	}

}
