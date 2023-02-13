import java.util.Scanner;

public class ExercicioSalario {

	public static void main(String[] args) {
		
		int horasTrabalhadas;
		double salarioHora, inss, salarioBruto, descontoInss, salarioLiquido;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as horas trabalhadas");
		horasTrabalhadas = teclado.nextInt();
		
		salarioHora = 51.29;
		inss = 0.1;
				
		salarioBruto = horasTrabalhadas * salarioHora;
		descontoInss = salarioBruto * inss;
		salarioLiquido = salarioBruto - descontoInss;
		System.out.println("Você trabalhou " + horasTrabalhadas + " horas");
		System.out.println("Seu salario bruto é de R$" + salarioBruto);
		System.out.println("O desconto de 10% do INSS foi de R$" + descontoInss);
		System.out.println("Seu salario liquido é de R$" + salarioLiquido);
		
		
		teclado.close();
	}
}
