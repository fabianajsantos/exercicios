package exercicios;

public class _2_TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//tipos primitivos
				
				//numericos inteiros
				
				byte anosEmpresa = 9; //150
				short numeroVoos = 325; //327679
				int id = 2147; //2147483647
				long pontosAcumulados = 3134845223L;
				
				//tipos numericos
				float salario  = 3250.654F;
				float comissao = 100.25F;
				float impostos = 375.00F;
				double vendasAcumuladas = 2991727103.01;

				
				//tipos booleanos
				boolean estaFerias = false;
				
				//tipo caractere				
				char status = 'A';
		
		//operacoes
				
				//multiplicacao * 
				System.out.println(anosEmpresa * 365);
				
				//divisao / 
				System.out.println(numeroVoos / 2);
				
	
		       //concatenacao
				System.out.println("O id: " + id + " ganha um salário bruto de  " + salario );
		
			   // soma  +
				System.out.println("A comisssao é de: " + salario + comissao);
				
				//subtracao
				float salarioFinal = salario - impostos;
				System.out.println("O salário final é: " +  salarioFinal);
				
				
		//System.out.println(result);
	}

}
