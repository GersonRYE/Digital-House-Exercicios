package LacosRepeticao;

import java.util.Scanner;

/*
 * 2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 * */

public class Exercicio2For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "� n�mero: ");
			x = leia.nextInt();
			if (x % 2 == 0) {
				par++;

			}
			if (x % 2 == 1) {
				impar++;

			}
		}
		System.out.println("Quantidade  de n�meros par: " + par);
		System.out.println("Quantidade de n�mero �mpar: " + impar);
		leia.close();
	}


}
