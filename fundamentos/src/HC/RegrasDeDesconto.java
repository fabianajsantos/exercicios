package HC;

public class RegrasDeDesconto {

	public static void main(String[] args) {

		Livro livro = new Livro();
		livro.setValor(59.90);

		System.out.println("Valor do livro:  " + livro.valor);

		// chamando o método encapsulado aplica desconto
		if (!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto em livros nao pode ser mais de 30%");

		} else {
			System.out.println("Valor com desconto:  " + livro.getValor());
		}

		LivroDigital ebook = new LivroDigital();
		ebook.setValor(29.90);

		System.out.println("Valor do ebook:  " + ebook.valor);

		// chamando o método encapsulado aplica desconto para ebook
		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto em ebook nao pode ser mais de 15%");

		} else {
			System.out.println("Valor do ebook com desconto:  " + ebook.getValor());
		}
	}
}
