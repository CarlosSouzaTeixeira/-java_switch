package exerc03;
import java.util.Scanner;
public class exerc03 {

	public static void main(String[] args) {
		int opc;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("     Op��es  |                    Mensagens                ");
		System.out.println("       1     |    Executa a rotina de Inclus�o de Alunos   ");
		System.out.println("       2     |    Executa a rotina de Altera��o de Alunos  ");
		System.out.println("       3     |    Executa a rotina de Exclus�o de Alunos   ");
		System.out.println("       4     |    Executa a rotina de Consulta de Alunos   ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print("Digite uma op��o: ");
		opc = leitor.nextInt();
		
		switch (opc) {
		case 1:
		System.out.print("Executa a rotina de Inclus�o de Alunos ");
			break;
		case 2:
		System.out.print("Executa a rotina de Altera��o de Alunos");
			break;
		case 3:
		System.out.print("Executa a rotina de Exclus�o de Alunos ");
			break;
		case 4:
		System.out.print("Executa a rotina de Consulta de Alunos");
			break;
		}
		

	}

}