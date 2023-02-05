package controle;

public class For3 {
	public static void main(String[] args) {
		
		//se você declarar a variavel dentro do for ela só está disponivel dentro do escopo do for.
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
	}

}
}