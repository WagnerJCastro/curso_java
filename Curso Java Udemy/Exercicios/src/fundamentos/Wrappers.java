package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		//byte
		//A primeira letra maiucusla define ser uma classe
		//Se fosse a primeira letra minuscula seria um primitivo
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; //primitivo é int
		Long l = 100000L;
		// O Long só converte de long para long
		
		System.out.println(b.byteValue());
		System.out.println(s.toString()); //Transforma em texto(string)
		System.out.println(i);
		System.out.println(l / 3);
		Integer i2 = Integer.parseInt("1000"); //Transforma texto(string) em int
		System.out.println(i2);
		
		Scanner entrada = new Scanner(System.in);
		
		Integer i3 = Integer.parseInt(entrada.nextLine()); //Transforma a entrada string em int
		
		System.out.println(i3*3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		
		entrada.close();
		
		
		Boolean bo = Boolean.parseBoolean("true"); //String para boolean, se não for exatamente "true" dara "false"
		System.out.println(bo);
		//Não existe a opção toUpperCase para boolean, mas existe para string.
		//Se transformar o boolean em string é possivel usar o toUpperCase
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
		
		
	}

}
