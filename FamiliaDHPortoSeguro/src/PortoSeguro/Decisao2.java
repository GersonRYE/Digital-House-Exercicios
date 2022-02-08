package PortoSeguro;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, resultado = 0;
		int op;
		
		Scanner leia = new Scanner(System.in);
				
		System.out.println("\nEntre com o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nEntre com o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n\t\tCalculadora");
		System.out.println("\n1 - soma");
		System.out.println("\n2 - diferença");
		System.out.println("\n3 - multiplicação");
		System.out.println("\n4 - divisão");
		System.out.println("\nEntre com a sua opção");
		op = leia.nextInt();
		

		switch(op) {
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1-n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			resultado = n1 / n2;
			break;
		default:
			System.out.println("\nOpção inválida");
		}
		System.out.println("\nResultado: " + resultado);
	}

}
