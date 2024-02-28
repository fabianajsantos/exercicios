package exercicios;

public class _4_Variaveis_Constantes {
	
	public static void main(String[] args) {
		
		//Contante -- nao muda valor durante exxecucao
		//Variável -- o valor altera
		
		//declara tipo variavel, nome variavel, valor variavel
		
		double raio = 3.4; //declaracao de variavel
		
		final double PI = 3.14159; //declaracao de contante
		
		double area = PI * raio * raio;
		System.out.println("Valor variavel área" + area);
		
		raio = 10;
		area = PI * raio * raio;

		System.out.println("Valor constante área = " + area );

	}

}
