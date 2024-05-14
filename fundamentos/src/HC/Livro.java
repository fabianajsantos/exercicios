package HC;

public class Livro {
	String nome;
	String descricao;
//atribudo privado - Encapsulamento 
	protected double valor;
	String isbn;
//Criando um atributo a partir de uma classe;
	//protected Autor autor;
	boolean impresso;

	public boolean aplicaDescontoDe(double percentagem) {	
		if (percentagem > 0.3) {
			return false;
		}
		else if(!this.impresso && percentagem  > 0.15) {
			return false;
		}
		/*this mostra que é um atributo da classe*/ 
		this.valor -= this.valor * percentagem;
		return true;
	}
	
	
/*Se atributos de classes forem private, precisaremos criar m método sempre que quisermos que 
alguém consiga adicionar um valor 	ao atributo e o mesmo quando quisermos que alguém 
consiga ler e exibir este valor. Os cosntrutores inicializam valores.*/	
public double getValor() {
	return valor;
}
public void setValor(double valor){
		this.valor = valor;
}
/*
public Livro(Autor autor) {
	this.autor = autor;
}

public Autor getAutor() {
	return autor;
}

public void setAutor(Autor autor) {
	this.autor = autor;
}*/
	
void mostrarDetalhes() {
		// Criando uma variável dentro do método
		String mensagem = "Mostrando detalhes do livro";
		// Acessando os atributos do objeto (System.out.println) e imprimindo println no
		// console.
		System.out.println(mensagem);
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		System.out.println("---");
     	//autor.mostrarDetalhes();
		System.out.println("---");
		

	}
//Método aplica desconto passando um valor como parametro ((double percentagem) 
//Encapsulamento
	
	     //public boolean aplicaDesdontoDe(double valor) {
		
		 //valor -= valor * valor

}
