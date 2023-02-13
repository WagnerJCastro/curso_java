package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double parte1 =  Math.pow(((1-5) * (2-7)) / 2, 2);
		System.out.println(parte1);
		
		double parte2 = (Math.pow((6* (3+2)), 2) / (3*2));
		System.out.println(parte2);
		
		double parte1e2 = Math.pow((parte2 - parte1), 3);
		System.out.println(parte1e2);
		
		double resultado = parte1e2 / (Math.pow(10, 3));
		System.out.println(resultado);
		
		
		//Outra opção mais detalhada
		
		double numA = Math.pow(6*(3+2), 2);
		double denA = 3*2;
		
		double numB = (1-5)*(2-7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado2 = superior / inferior;
		
		System.out.println("O resultado é: " + resultado2);
		
		
		
		
	}
}
