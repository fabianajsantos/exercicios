package HC;

public class CadastroDeLivros {
		
	public static void main(String[] args) {
		
		/*//Instanciando (criando) objeto autor a partir da autor
		Autor autor = new Autor();
		//Acessando os atributos do autor
		autor.nome = "Escritor";
		autor.email = "escritor@email.com";
		autor.cpf = "999.999.999.00";*/
		
		//Instanciando (criando) objeto livro a partir da classe livro 
		Livro livro = new Livro();		
		//Acessando os atributos do livro
		livro.nome = "Análise de Projetos";
		livro.descricao = "Scrum";
		livro.setValor(65.30);
		livro.isbn = "0245866512";
		
        //associando o objeto autor ao livro
		/*livro.autor = autor;*/
		
		//chamando o metodo que imprimira os dados
		livro.mostrarDetalhes();		
	
		//----------------------------Criando outro objeto ----------------------------------------//
		
		//Criando objeto outro autor
		/*Autor outroAutor = new Autor();		
		outroAutor.nome = "Escritor2";
		outroAutor.email = "escritor2@email.com";
		outroAutor.cpf = "999.999.999.01";		*/
		
		//Criando outro objeto outro livro
		Livro outroLivro = new Livro();
		outroLivro.nome = "Banco de Dados";
		outroLivro.descricao = "Teste";
		outroLivro.setValor(75.30);
		outroLivro.isbn = "0245866512";
		
		 //associando o objeto autor ao livro
	//	outroLivro.setAutor(outroAutor);
		
		outroLivro.mostrarDetalhes();

		
		//----------------------------Criando outro objeto ----------------------------------------//
				
	}
	}
