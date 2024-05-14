package classe;

public class Aluno {
	
	String nome;
	double nota;
	
	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Joao";
		aluno1.nota = 42.9 ;
		
		if(aluno1.nota >= 60) {
			System.out.println("Aprovado");
		}
		//else
			//System.out.println("Reprovado");
	
	}
}

/*	int a= 10;
int b = 25;
int c = 10;
String d = "10";
String e = d + c + b + a;
System.out.println(e);*/

/*
int x = 0;

for (int i = 0; i < 5; i++) {
	System.out.println("Loop for");
*/
/*
int a = 10;

System.out.println(--a);
*/