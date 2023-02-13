package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		//Conversões para formatos "menores" devem ser explicitas pois você pode perder dados.
		
		double a = 1.12345684884;
		System.out.println(a);
		
		//Uma maneira de converter o double para float é colocando "F" no fim do numero.
		float b = 1.12345684884F;
		System.out.println(b);
		
		//Outra maneira é fazendo o cast do formato que você quer:
		float c = (float) 1.12345684884;
		System.out.println(c);
		
		//Vale notar que a partir de certo ponto o float já não apresenta tantos caracteres quando o double
		//Pois ocorreu perda da informação por float ser menor.
		
		int d = 300;
		System.out.println(d);
		byte e = (byte) d;
		System.out.println(e);
		
		//Os mais comuns usados são int e double
		
		
		
	}
}
