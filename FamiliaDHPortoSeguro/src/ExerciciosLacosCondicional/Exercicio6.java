package ExerciciosLacosCondicional;

import java.util.Scanner;

/*
 * 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*
 */

public class Exercicio6 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
		} else if (idade > 7 && idade <= 11) {
			System.out.println("Infantil B");
		} else if (idade > 11 && idade <= 13) {
			System.out.println("Juvenil A");
		} else if (idade > 13 && idade <= 17) {
			System.out.println("Juvenil B");
		} else if (idade > 17) {
			System.out.println("Adultos");
		} else if (idade > 0 && idade < 5) {
			System.out.println("Idade não permitida");
		} else {
			System.out.println("Valor inválido!");
		}

	}
}
