package beeCrowd;

import java.util.Scanner;

public class Exercicio1050 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int ddd;
		ddd = teclado.nextInt();
		if(ddd == 61) {
			System.out.println("Brasilia");
		} else if (ddd == 71){
			System.out.println("Salvador");
		} else if (ddd == 11){
			System.out.println("São Paulo");
		} else if (ddd == 21){
			System.out.println("Rio de Janeiro");
		} else if (ddd == 32){
			System.out.println("Juiz de Fora");
		} else if (ddd == 19){
			System.out.println("Campinas");
		} else if (ddd == 27){
			System.out.println("Vitoria");
		} else if (ddd == 31){
			System.out.println("Belo Horizonte");
		} else {
			System.out.println("DDD nao cadastrado");
		}
		
		
		
		//Outro jeito
		
		switch (ddd) {
		case 61:
			System.out.println("Brasilia");
			break;
		case 71:
			System.out.println("Salvador");
			break;
		case 11:
			System.out.println("São Paulo");
			break;
		case 21:
			System.out.println("Rio de Janeiro");
			break;
		case 32:
			System.out.println("Juiz de Fora");
			break;
		case 19:
			System.out.println("Campinas");
			break;
		case 27:
			System.out.println("Vitoria");
			break;
		case 31:
			System.out.println("Belo Horizonte");
			break;
		default:
			System.out.println("DDD nao cadastrado");
		}
		
		
		
		teclado.close();
	}
}
