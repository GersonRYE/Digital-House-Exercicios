package ExerciciosLacosRepeticao;

import java.util.Scanner;

/*
 * 6-	Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)*/

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double tecla, soma = 0, i = 0, media = 0;
		String valores = "";

		do {
			System.out.println("Digite um n�mero do teclado ou 0 para sair:");
			tecla = leia.nextInt();
			if (tecla > 0) {
				if (tecla % 3 == 0) {
					i++;
					soma += tecla;
					media = soma / i;
					valores = valores + tecla + " + ";
				} else {
					System.out.println();
				}
			}
		} while (tecla != 0);
		System.out.print("Somat�ria dos mult�plos de 3: \n");
		// devido ao lop do do...while, " + " aparece os tres espa�os de caracteres no resultado final, ent�o para remover essa repeti��o
		// para que n�o apare�a no resultado final � usado a condi��o abaixo removendo os dois ultimos caracteres, assim
		// evitando que "+ " apare�a no resultado final.
		valores = valores.substring(0, valores.length() - 2);
		System.out.print(valores);
		System.out.print("= " + soma);
		System.out.println("\nQuantidade de n�mero m�ltiplos de 3: \n" + i);
		System.out.println("A m�dia de todos os n�mero inteiros m�ltiplos de 3: \n" + media);
		leia.close();
	}

}
