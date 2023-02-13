package beeCrowd;

import java.util.Scanner;

public class Exercicio1018 {

	// Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
	// (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de
	// 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas
	// necessárias.

	// Entrada
	// O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

	// Saída
	// Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo
	// necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de
	// linha após cada linha, caso contrário seu programa apresentará a mensagem:
	// “Presentation Error”.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
		valor = teclado.nextInt();
		nota100 = valor / 100;
		nota50 = (valor % 100) / 50;
		nota20 = ((valor % 100) % 50) / 20;
		nota10 = (((valor % 100) % 50) % 20) / 10;
		nota5 = ((((valor % 100) % 50) % 20) % 10) / 5;
		nota2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
		nota1 = (((((valor % 100) % 50) % 20) % 10) % 5) % 2;

		System.out.printf(
				"%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00"
				+ "\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00"
				+ "\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00"
				+ "\n%d nota(s) de R$ 1,00\n", valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1);
		teclado.close();

	}

}
