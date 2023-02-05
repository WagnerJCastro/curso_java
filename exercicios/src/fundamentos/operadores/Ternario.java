package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 3.6;
		
		// Após o "?" temos o valor atribuido se for verdadeiro e depois se for falso.		
		String resultado = media >= 7.0 ? "aprovado." : "em recuperação.";
		
		System.out.println("O aluno está " + resultado);
		
		//Para mais opções pode ser feito:
		
		
		String resultadoParcial = media >= 5.0 ? "Em recuperação." : "Reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		// Ou pode ser colocado dentro de uma mesma linha assim:
		
		String resultadoFinal2 = media >= 7.0 ? "aprovado." : media >= 5.0 ? "Em recuperação." : "Reprovado.";
		
		System.out.println("O aluno está " + resultadoFinal2);
		
		
		//Outro Exemplo
		double nota = 9.9;
		boolean bomComportamente = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamente && passouPorMedia;
		String desconto = temDesconto ? "sim" : "não";
		
		System.out.println("Tem desconto? " + desconto);
		
			
	}
}
