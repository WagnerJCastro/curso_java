package beeCrowd;

import java.util.Scanner;

public class Exercicio1047 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int horaInicio, minInicio, horaFinal, minFinal, totalInicio, totalFinal, duracaoTotal, horaDuracao, minDuracao;
		horaInicio = teclado.nextInt();
		minInicio = teclado.nextInt();
		horaFinal = teclado.nextInt();
		minFinal = teclado.nextInt();

		
		totalInicio = (horaInicio * 60) + minInicio;
		totalFinal = (horaFinal * 60) + minFinal;
		duracaoTotal = totalFinal - totalInicio;
		
		if(duracaoTotal <= 0) {
		duracaoTotal = duracaoTotal + 1440;
		}
		horaDuracao = duracaoTotal / 60;
		minDuracao = duracaoTotal % 60;

		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horaDuracao, minDuracao);
		
		teclado.close();
	}

}
