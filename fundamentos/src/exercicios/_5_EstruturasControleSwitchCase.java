package exercicios;
import java.util.Scanner;

public class _5_EstruturasControleSwitchCase {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha a opção: ");
		int opcao = scanner.nextInt();
		
		switch(opcao) {
		case 1: System.out.println("Tropeiro"); break;
		case 2: System.out.println("Macarronada"); break;
		case 3: System.out.println("Feijoada"); break;
		default: System.out.println("Salada :) ");break;
		}		
	}
}
