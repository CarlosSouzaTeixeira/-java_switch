package exerc06;
import java.util.Scanner;
public class exerc06 {

	public static void main(String[] args) {
		int cod;
		double por_sal, novo_salario, dif_salario, salario;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("      Cargo          |      Código     |    Percentual  ");
		System.out.println("      Diretor        |        001      |       10%   ");
		System.out.println("      Engenheiro     |        002      |       20%   ");
		System.out.println("      Técnico        |        003      |       30%   ");
		System.out.println("      Gerente        |        004      |       10%   ");
		System.out.println("      Analista       |        005      |       30%   ");
		System.out.println("      Coordenador    |        006      |       20%   ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print("Digite o código do cargo: ");
		cod = leitor.nextInt();
		System.out.print("Digite o salário em R$: ");
		salario = leitor.nextDouble();
		
		switch (cod) {
		case 001:
			por_sal = (10* salario)/100;
			novo_salario = por_sal + salario;
			dif_salario = novo_salario - salario;	
		System.out.println("Cargo: Diretor  ");
		System.out.println("Salário antigo em R$: "+salario);
		System.out.println("Novo salário em R$: "+novo_salario);
		System.out.println("Diferença de salário em R$: "+dif_salario);
			break;
		case 002:
			por_sal = (20* salario)/100;
			novo_salario = por_sal + salario;
			dif_salario = novo_salario - salario;	
		System.out.println("Cargo: Engenheiro  ");
		System.out.println("Salário antigo em R$: "+salario);
		System.out.println("Novo salário em R$: "+novo_salario);
		System.out.println("Diferença de salário em R$: "+dif_salario);
			break;
		case 003:
			por_sal = (30* salario)/100;
			novo_salario = por_sal + salario;
			dif_salario = novo_salario - salario;	
		System.out.println("Cargo: Técnico  ");
		System.out.println("Salário antigo em R$: "+salario);
		System.out.println("Novo salário em R$: "+novo_salario);
		System.out.println("Diferença de salário em R$: "+dif_salario);
			break;
		case 004:
			por_sal = (10* salario)/100;
			novo_salario = por_sal + salario;
			dif_salario = novo_salario - salario;	
		System.out.println("Cargo: Gerente  ");
		System.out.println("Salário antigo em R$: "+salario);
		System.out.println("Novo salário em R$: "+novo_salario);
		System.out.println("Diferença de salário em R$: "+dif_salario);
			break;
		case 005:
			por_sal = (30* salario)/100;
			novo_salario = por_sal + salario;
			dif_salario = novo_salario - salario;	
		System.out.println("Cargo: Analista  ");
		System.out.println("Salário antigo em R$: "+salario);
		System.out.println("Novo salário em R$: "+novo_salario);
		System.out.println("Diferença de salário em R$: "+dif_salario);
			break;
		case 006:
			por_sal = (20* salario)/100;
			novo_salario = por_sal + salario;
			dif_salario = novo_salario - salario;	
		System.out.println("Cargo: Coordenador  ");
		System.out.println("Salário antigo em R$: "+salario);
		System.out.println("Novo salário em R$: "+novo_salario);
		System.out.println("Diferença de salário em R$: "+dif_salario);
			break;
			default:
				por_sal = (40* salario)/100;
				novo_salario = por_sal + salario;
				dif_salario = novo_salario - salario;	
			System.out.println("Cargo: Outro cargo  ");
			System.out.println("Salário antigo em R$: "+salario);
			System.out.println("Novo salário em R$: "+novo_salario);
			System.out.println("Diferença de salário em R$: "+dif_salario);
				
			
		
		}
		

	}

}