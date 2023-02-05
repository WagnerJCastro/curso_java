package fundamentos;

import java.util.Scanner;

		//import javax.swing.JOptionPane;

public class DesafioConversao {
	
	public static void main(String[] args) {
		//Desafio - Receber os ultimos 3 salarios de um funcionario e fornecer a media
		//O funcionado deve poder inserir os dados de casa decimal com "." ou ",".
		
		//Usando JOptionPane
		//String salario1 = JOptionPane.showInputDialog("Digite o primeiro salario:");
		//String salario2 = JOptionPane.showInputDialog("Digite o segundo salario:");
		//String salario3 = JOptionPane.showInputDialog("Digite o terceiro salario:");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", "."); // Pode ser usado o replace aqui ao inves de nova linha
		System.out.print("Digite o seu segundo salario: ");
		String salario2 = entrada.nextLine();
		System.out.print("Digite o seu terceiro salario: ");
		String salario3 = entrada.nextLine();
		
		salario1 = salario1.replace(",", ".");
		salario2 = salario2.replace(",", ".");
		salario3 = salario3.replace(",", ".");
		
		double numsala1 = Double.parseDouble(salario1);
		double numsala2 = Double.parseDouble(salario2);
		double numsala3 = Double.parseDouble(salario3);
		
		System.out.println("A sua média salarial é: " + (numsala1 + numsala2 + numsala3) / 3);
		
		entrada.close();
		
		
		
		
		
		
	}

}
