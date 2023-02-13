import java.util.Scanner;

public class ExercicioViagem {

	public static void main(String[] args) {
		int kmLitro = 12;
		double tempoViagem, velocidadeMedia, distancia;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tempo de Viagem: ");
		tempoViagem = teclado.nextDouble();
		
		System.out.println("Digite a velocidade media: ");
		velocidadeMedia = teclado.nextDouble();
		
		double tempoMinutos = (((tempoViagem % 1) / 60 ) * 100);
		double tempoHoras = tempoViagem - (tempoViagem % 1);
		double tempoFinal = tempoMinutos + tempoHoras;
		
		distancia = velocidadeMedia * tempoFinal;
		
		System.out.println("A distancia percorrida foi de: " + distancia + " km");
		
		double litrosUtilizados = distancia / kmLitro;
		
		System.out.println("O consumo de combustivel gasto foi de: " + litrosUtilizados + " litros");
		
		teclado.close();
	}
	
}
