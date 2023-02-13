package beeCrowd;
import java.util.Scanner;

public class Exercicio1020 {
	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		int idade, ano, mes, dia;
		
		idade = teclado.nextInt();
		ano = idade / 365;
		mes = (idade % 365) / 30;
		dia = (idade % 365) % 30;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
		teclado.close();
		
	}
}
