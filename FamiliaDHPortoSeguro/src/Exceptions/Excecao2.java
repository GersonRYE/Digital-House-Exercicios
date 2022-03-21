package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {

	// demonstra lançameno de um exececao quando ocorre uma divisao por zero
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		boolean continueLoop = true;//Determina se mais entradas são necessarias;
		
		do {
			try {
				System.out.println("\nEnte com o numerador: ");
				int numerador = leia.nextInt();
				
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				
				int resultado = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
				continueLoop = false;
			}//fim do try
			catch(InputMismatchException inputMismatchException ) {
				System.err.printf("\n\nException: %s\n", inputMismatchException);
				leia.nextLine();//limpeza do cash
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro..."
						+ "Por favor, tente novamente!!!");
			}
			catch(ArithmeticException arithmeticException) {
				System.err.printf("\n\nException: %s\n", arithmeticException);
				System.out.println("\nZero é um denominador invalido!!!"
						+ "Por favor, tente novamente...");
			}
		}
		while(continueLoop);
	}

}
