package classe;

public class Produtos {
	
	// declarando atributos do objeto
	
	double preco;
	String nome;
	static double desconto = 0.25;
    

	// declarando o metodo do objeto
	void imprimeProdutos() {
		System.out.println(nome + " Preço:  " +  preco);
	}
	
	double precoComDesconto() {
		return preco - (preco * .01);
	}
	
	//o processo sempre começa no main
	public static void main(String[] args) {

		// Produtos Produtos ;- criando a variavel de referencia
		// new Produtos(); - criando o objeto
		// Produtos Produtos = new Produtos(); - ligando o objeto a variavel de referencia

		Produtos produtos = new Produtos();

		// criando uma matriz de Produtos
		Produtos[] meusProdutos = new Produtos[2];
		meusProdutos[0] = new Produtos(); //matriz sempre começa do 0
		meusProdutos[1] = new Produtos();

		// acessando os atributos do método
		meusProdutos[0].nome = "Notebook";
		meusProdutos[0].preco = 2000.45;
		meusProdutos[1].nome = "Monitor";
		meusProdutos[1].preco = 1500.33;
		
		///também poderia ser um for
		int x = 0;		
		while (x < meusProdutos.length) {
			// executando o metodo
			meusProdutos[x].imprimeProdutos();
			x = x + 1;
		}
		
		//imprimindo descontos
		double precoComDesconto1 = meusProdutos[0].precoComDesconto();
		double precoComDesconto2 = meusProdutos[1].precoComDesconto();
		
		System.out.println(meusProdutos[0].nome + ": Preco com desconto de 10% = R$ " + String.format("%.2f", precoComDesconto1));
		System.out.println(meusProdutos[1].nome + ": Preco com desconto de 10% = R$ " + String.format("%.2f", precoComDesconto2));
	}

}
