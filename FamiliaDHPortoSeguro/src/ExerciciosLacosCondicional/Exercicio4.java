package ExerciciosLacosCondicional;

import java.util.Scanner;

/*
 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
 * e se é positivo ou negativo.
 * */

public class Exercicio4 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n;

		System.out.println("Digite um número: ");
		n = leia.nextInt();

		if(n % 2 == 0) {
			System.out.println("Este número é par");
		}else {
			System.out.println("Este número é ímpar");
		}
		if(n >= 0) {
			System.out.println("Este número é positivo");
		}else {
			System.out.println("Este número é negativo");
		}
	}
}
