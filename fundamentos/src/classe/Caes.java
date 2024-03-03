package classe;

public class Caes {

	// declarando atributos do objeto
	int tamanho;
	String raca;
	String nome;

	// declarando o metodo do objeto
	void latidoCaes() {
		System.out.println(nome + " late : Au, Au!!");
	}
	
	//o processo sempre começa no main
	public static void main(String[] args) {

		// Caes caes ;- criando a variavel de referencia
		// new Caes(); - criando o objeto
		// Caes caes = new Caes(); - ligando o objeto a variavel de referencia

		Caes caes = new Caes();

		// criando uma matriz de caes
		Caes[] meusCaes = new Caes[2];
		meusCaes[0] = new Caes(); //matriz sempre começa do 0
		meusCaes[1] = new Caes();

		// acessando os atributos do método
		meusCaes[0].nome = "Sheik";
		meusCaes[0].raca = "Shitzu";
		meusCaes[0].tamanho = 20;
		meusCaes[1].nome = "Caramelo";
		meusCaes[1].raca = "Vira-latas";
		meusCaes[1].tamanho = 40;


		///também poderia ser um for
		int x = 0;
		while (x < meusCaes.length) {
			// executando o metodo
			meusCaes[x].latidoCaes();
			x = x + 1;
		}
	}
}
