package classe;

public class Cao {
	
	// declarando atributos do objeto
	int tamanho;
	String raca;
	String nome;
	
	// declarando o metodo do objeto - void que dizer que retorna vazio
	void latido() {
		System.out.println(nome + ": Au, Au!!");
	}
	public static void main(String[] args) {

		// Cao cao1 ;- criando a variavel de referencia
		// new Cao(); - criando o objeto
		// Cao cao1 = new Cao(); - ligando o objeto a variavel de referencia

		Cao cao = new Cao();
		
		//acessando os atributos do método
		cao.tamanho = 20;
		cao.nome = "Sheik";
		cao.raca = "Shitzu";

		// executando o metodo
		cao.latido();
	}
}
