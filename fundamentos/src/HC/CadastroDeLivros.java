package HC;

public class CadastroDeLivros {

	public static void main(String[] args) {

		// Instanciando (criando) objeto livro a partir da classe livro
		Livro livro = new Livro();
		// Acessando os atributos do livro
		livro.nome = "Análise de Projetos";
		livro.descricao = "Scrum";
		livro.setValor(65.30);
		livro.isbn = "0245866512";

		// chamando o metodo que imprimira os dados
		livro.mostrarDetalhes();

		// --------------Criando outro objeto-------------//

		// Criando outro objeto outro livro
		Livro outroLivro = new Livro();
		outroLivro.nome = "Banco de Dados";
		outroLivro.descricao = "Teste";
		outroLivro.setValor(75.30);
		outroLivro.isbn = "0245866512";

		outroLivro.mostrarDetalhes();
	}
}
//identar ctrl + shif + f