import java.util.Scanner;

public class DesafioDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.println("Digite um numero");
			num = entrada.nextInt();
		} while(num >= 0);
		System.out.println("Programa encerrado");
		entrada.close();
	}
}
