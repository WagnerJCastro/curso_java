package classes;

public class DataMetodo {

	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada(){
		//String diaS = Integer.toString(dia);
		//String mesS = Integer.toString(mes);
		//String anoS = Integer.toString(ano);
		//return diaS +"/" + mesS +"/" + anoS;
	
		return String.format("%d/%d/%d", dia, mes, ano);
		
	}
	
	//Esse metodo só funciona para retornar informação no terminal
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
