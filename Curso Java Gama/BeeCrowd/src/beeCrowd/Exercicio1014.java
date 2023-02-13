package beeCrowd;
import java.util.Scanner;

public class Exercicio1014 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x; //distancia
		double y; // consumo
		
		x = teclado.nextInt();
		y = teclado.nextDouble();
		
		double kml = x / y;
		
		System.out.printf("%.3f km/l\n", kml);
		
		teclado.close();
		
	}
	
}
