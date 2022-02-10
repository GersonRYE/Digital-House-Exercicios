package LacosRepeticao;

import java.util.Scanner;

/*
 * 5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
 * (DO...WHILE)*/

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int tecla, i = 0, soma = 0;

		System.out.println("Digite um n�mero do teclado: ");
		tecla = leia.nextInt();

		do {
			
			soma += i;
			if (i == 0) {
				System.out.print(0);
			} else {
				System.out.print(" + " + i);
				
			}
			i++;
		} while (i <= tecla);

		System.out.print(" = " + soma);
		leia.close();
	}

}
