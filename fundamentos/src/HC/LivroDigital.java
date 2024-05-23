package HC;

public class LivroDigital extends Livro {
	// Ao utilizar a palavra reservada extends, estamos dizendo que Livro digital
	// herda tudo da classe livro

	private String marcaDagua;

	public String marcaDagua() {
		return marcaDagua;
	}

	public void setMarcaDagua(String marcaDagua) {
		this.marcaDagua = marcaDagua;
	}

	public boolean aplicaDescontoDe(double percentagem) {
		if (percentagem > 0.15) {
			return false;
		}
		this.valor -= this.valor * percentagem;
		return true;
	}
}