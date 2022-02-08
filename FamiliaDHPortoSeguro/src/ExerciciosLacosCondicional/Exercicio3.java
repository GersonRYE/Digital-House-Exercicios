package ExerciciosLacosCondicional;

import java.util.Scanner;

/*
 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double n1, n2, n3, n4;

		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();

		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();

		System.out.println("Digite o terceito número: ");
		n3 = leia.nextInt();

		System.out.println("Digite o quarto número: ");
		n4 = leia.nextInt();

		n1 = Math.pow(n1, 2);
		n2 = Math.pow(n2, 2);
		n3 = Math.pow(n3, 2);
		n4 = Math.pow(n4, 2);

		if (n3 >= 1000) {
			System.out.println("O valor do terceiro numero é maior ou igual que 1000, seu valor é:  " + n3);
		} else {
			System.out.printf("O valor do primeiro número é: %.0f", n1);
			System.out.printf("\nO valor do segundo número é: %.0f", n2);
			System.out.printf("\nO valor do terceiro número é: %.0f", n3);
			System.out.printf("\nO valor do quarto número é: %.0f", n4);

		}
	}

}
