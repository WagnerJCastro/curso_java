package classes;

public class DataTesteMetodo {

public static void main(String[] args) {
		
		DataMetodo d1 = new DataMetodo();
		d1.dia = 03;
		d1.mes = 07;
		d1.ano = 1994;
		
		var d2 = new DataMetodo();
		d2.dia = 16;
		d2.mes = 07;
		d2.ano = 1997;
		
		//Pòde se definir o resultado como uma variavel para utilizar dentro desse algoritimo
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.printf("A data é %s\n", dataFormatada1);
		
		System.out.printf("A data é %s", d2.obterDataFormatada());
		
		//Pode se receber um "System.out.println"
		d1.imprimirDataFormatada();
		
		
		
		
		
		
	}
}
