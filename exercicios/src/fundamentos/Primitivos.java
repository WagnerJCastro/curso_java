package fundamentos;

public class Primitivos {

	public static void main(String[] args) {
		//Exercicios focando em informações de um funcionario
		
		// Tipos numericos inteiros
		// O que os diferencia são seu tamanho, organizado do menor para o maior.
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		// para usar o long com numeros que passam um int é preciso adicionar "L" ao fim do numero.
		long pontosAcumulados = 3_234_845_223L; // É possivel usar "_" para usar como pontuação de numeros.
		
		// Tipos Numericos Reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false;
		
		// Tipo Caractere
		char status = 'A';
		
		
		//Calculando para usar as variavels
		//Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de Viagens
		System.out.println(numeroDeVoos /2);
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
				
		
		
	}
}
