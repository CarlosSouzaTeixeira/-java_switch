package exerc05;
import java.util.Scanner;
public class exerc05 {

	public static void main(String[] args) {
		int cod;
		double preco, pre_cod, tot;
		
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("     C�digo  |                        Condi��o de pagamento                ");
		System.out.println("       1     |       � vista em dinheiro ou cheque, com 10% de desconto   ");
		System.out.println("       2     |       � vista com cart�o de cr�dito, com 5% de desconto  ");
		System.out.println("       3     |       Em 2 vezes, pre�o normal de etiqueta sem juros   ");
		System.out.println("       4     |       Em 3 vezes, pre�o de etiqueta com acr�scimo de 10%   ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print("Digite o c�digo de pagamento: ");
		cod = leitor.nextInt();
		
		switch (cod) {
		case 1:
		System.out.println("Forma de pagamento: � vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("Digite o valor do pre�o da etiqueta do produto em R$: ");
		preco = leitor.nextDouble();
		pre_cod = (10* preco)/100;
		tot= preco-pre_cod;
		System.out.print("Pre�o da compra em R$: "+tot);
		
			break;
		case 2:
			System.out.println("Forma de pagamento: � vista com cart�o de cr�dito, com 5% de desconto");
			System.out.println("Digite o valor do pre�o da etiqueta do produto em R$: ");
			preco = leitor.nextDouble();
			pre_cod = (5* preco)/100;
			tot= preco-pre_cod;
			System.out.print("Pre�o da compra em R$: "+tot);
			
				break;
		case 3:
			System.out.println("Forma de pagamento: Em 2 vezes, pre�o normal de etiqueta sem juros");
			System.out.println("Digite o valor do pre�o da etiqueta do produto em R$: ");
			preco = leitor.nextDouble();
			System.out.print("Pre�o da compra em R$: "+preco);
			
				break;
		case 4:
			System.out.println("Forma de pagamento: Em 3 vezes, pre�o de etiqueta com acr�scimo de 10%");
			System.out.println("Digite o valor do pre�o da etiqueta do produto em R$: ");
			preco = leitor.nextDouble();
			pre_cod = (10* preco)/100;
			tot= preco+pre_cod;
			System.out.print("Pre�o da compra em R$: "+tot);
			
				break;
		}
		

	}

}