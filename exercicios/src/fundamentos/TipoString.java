package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";
		s = s + " e boa noite";
		System.out.println(s);

		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde e boa noite"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;

		// \n irá apresentar o resultado na proxima linha
		System.out.println(
				"Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade; " + idade + "\nSalario: " + salario + "\n\n");

		
		// prinf imprime o formato e nao necessariamente o que está escrito escrito
		// Cada "%" representa a variavel a ser usada que devera estar posta em ordem no
		// final da linha de comando
		// o "s", "d" e "f" depois do "%" é para definir que é uma variavel "String",
		// "double" e "float"
		// o ".2" no salario representa quantas cadas decimais queremos ter impressos
		// nesse numero
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f\n", nome, sobrenome, idade, salario);

		// É possivel criar novas strings a partir de outras strings, Exemplo:
		String infoFuncionario = ("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade; " + idade + "\nSalario: "
				+ salario + "\n\n");
		System.out.println(infoFuncionario);

	}

}
