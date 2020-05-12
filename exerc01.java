package exerc01;
import java.util.Scanner;
public class exerc01 {

	public static void main(String[] args) {
		int cod;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("      Código   |    Produto ");
		System.out.println("       001     |    Parafuso ");
		System.out.println("       002     |    Porca ");
		System.out.println("       003     |    Prego ");
		System.out.println("       004     |    Ferramenta ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print("Digite o código do produto: ");
		cod = leitor.nextInt();
		
		switch (cod) {
		case 001:
		System.out.print("Parafuso ");
			break;
		case 002:
		System.out.print("Porca ");
			break;
		case 003:
		System.out.print("Prego ");
			break;
		case 004:
		System.out.print("Ferramenta");
			break;
			
			default:
			System.out.print("Diversos");
		}
		

	}

}
