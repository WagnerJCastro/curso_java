package classes;

public class ProdutoMetodo {

	String nome;
	double preco;
	double desconto;
	
	//double precoComDesconto(double preco, double desconto)
	//Não é preciso receber os parametros quando eles já estão dentro da classe!
	
	double precoComDesconto() {
		double descontado = preco * (1 - desconto);
		return descontado;
	}
	
}
