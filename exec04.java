package exerc04;

import java.util.Scanner;

public class exec04 {

	public static void main(String[] args) {
		int opc;
		double n1, n2, n3, ma, mp;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a op��o de m�dia que deseja (1- para m�dia aritm�tica ou 2- para m�dia ponderada (pesos 3,3,4).: ");
		opc = leitor.nextInt();
		switch (opc) {
		case 1:
		System.out.println("Voc� escolheu m�dia aritm�tica ");
		
		System.out.println("Digite a primeira nota: ");
		n1 = leitor.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = leitor.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = leitor.nextDouble();
		
		ma = (n1+n2+n3)/3;
		System.out.println("A m�dia foi: "+ma);
		
			break;
		case 2:
			System.out.println("Voc� escolheu m�dia ponderada ");
			
			System.out.println("Digite a primeira nota: ");
			n1 = leitor.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			n2 = leitor.nextDouble();
			
			System.out.println("Digite a terceira nota: ");
			n3 = leitor.nextDouble();
			
			mp = ((n1*3)+(n2*3)+(n3*4))/10;;
			System.out.println("A m�dia foi: "+mp);
			
				break;
		

	}

}
}