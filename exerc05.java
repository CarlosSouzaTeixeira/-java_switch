package exerc05;
import java.util.Scanner;
public class exerc05 {

	public static void main(String[] args) {
		int cod;
		double preco, pre_cod, tot;
		
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("     Código  |                        Condição de pagamento                ");
		System.out.println("       1     |       À vista em dinheiro ou cheque, com 10% de desconto   ");
		System.out.println("       2     |       À vista com cartão de crédito, com 5% de desconto  ");
		System.out.println("       3     |       Em 2 vezes, preço normal de etiqueta sem juros   ");
		System.out.println("       4     |       Em 3 vezes, preço de etiqueta com acréscimo de 10%   ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print("Digite o código de pagamento: ");
		cod = leitor.nextInt();
		
		switch (cod) {
		case 1:
		System.out.println("Forma de pagamento: À vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("Digite o valor do preço da etiqueta do produto em R$: ");
		preco = leitor.nextDouble();
		pre_cod = (10* preco)/100;
		tot= preco-pre_cod;
		System.out.print("Preço da compra em R$: "+tot);
		
			break;
		case 2:
			System.out.println("Forma de pagamento: À vista com cartão de crédito, com 5% de desconto");
			System.out.println("Digite o valor do preço da etiqueta do produto em R$: ");
			preco = leitor.nextDouble();
			pre_cod = (5* preco)/100;
			tot= preco-pre_cod;
			System.out.print("Preço da compra em R$: "+tot);
			
				break;
		case 3:
			System.out.println("Forma de pagamento: Em 2 vezes, preço normal de etiqueta sem juros");
			System.out.println("Digite o valor do preço da etiqueta do produto em R$: ");
			preco = leitor.nextDouble();
			System.out.print("Preço da compra em R$: "+preco);
			
				break;
		case 4:
			System.out.println("Forma de pagamento: Em 3 vezes, preço de etiqueta com acréscimo de 10%");
			System.out.println("Digite o valor do preço da etiqueta do produto em R$: ");
			preco = leitor.nextDouble();
			pre_cod = (10* preco)/100;
			tot= preco+pre_cod;
			System.out.print("Preço da compra em R$: "+tot);
			
				break;
		}
		

	}

}