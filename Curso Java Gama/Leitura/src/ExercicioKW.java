import java.util.Scanner;

public class ExercicioKW {

	public static void main(String[] args) {
		
		double salarioMinimo, kwGasto, valorKW;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o Valor do Salario Minimo");
		salarioMinimo = teclado.nextDouble();
		
		System.out.println("Digite o Gasto em KW da Residencia");
		kwGasto = teclado.nextDouble();
		
		valorKW = salarioMinimo / 700;
		double valorConta = valorKW * kwGasto;
		
		System.out.println("Valor de cada kw: R$" + valorKW);
		System.out.println("Valor da conta a ser paga: R$" + valorConta);
		
		double desconto = 0.1;
		valorConta = (valorKW * kwGasto) *( 1 - desconto);
		System.out.println("Valor da conta com desconto: R$" + valorConta);
		
		teclado.close();
	}
}
