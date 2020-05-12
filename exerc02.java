package exerc02;
import java.util.Scanner;
public class exerc02 {

	public static void main(String[] args) {
		int cod, qtd;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("    Código   |        Produto          |    Preço  ");
		System.out.println("      100    |        Cachorro quente  |    3.20   ");
		System.out.println("      101    |        Bauru simples    |    4.30   ");
		System.out.println("      102    |        Bauru com ovo    |    5.50   ");
		System.out.println("      103    |        Hambúrger        |    3.20   ");
		System.out.println("      104    |        Cheeseburguer    |    4.30   ");
		System.out.println("      105    |        Refrigerante     |    4.00   ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print("Digite o código do produto: ");
		cod = leitor.nextInt();
		System.out.print("Digite a quantidade: ");
		qtd = leitor.nextInt();
		
		double vt;
		switch (cod) {
		case 100:
			vt = qtd*3.20;
		System.out.println("Cachorro quente ");
		System.out.println("Valor a ser pago em R$: "+vt);
			break;
		case 101:
			vt = qtd*4.30;
		System.out.println("Bauru simples ");
		System.out.println("Valor a ser pago em R$: "+vt);
			break;
		case 102:
			vt = qtd*5.50;
		System.out.println("Bauru com ovo ");
		System.out.println("Valor a ser pago em R$: "+vt);
			break;
		case 103:
			vt = qtd*3.20;
		System.out.println("Hambúrger ");
		System.out.println("Valor a ser pago em R$: "+vt);
			break;
		case 104:
			vt = qtd*4.30;
		System.out.println("Cheeseburguer ");
		System.out.println("Valor a ser pago em R$: "+vt);
			break;
			
		case 105:
			vt = qtd*4.0;
		System.out.println("Refrigerante ");
		System.out.println("Valor a ser pago em R$: "+vt);
			break;
			
		}
		

	}

}