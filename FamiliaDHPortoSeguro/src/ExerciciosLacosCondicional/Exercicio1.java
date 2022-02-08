package ExerciciosLacosCondicional;

import java.util.Scanner;

/*
 * 1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de 
 * seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado 
 * de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça 
 * um sistema que leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na 
 * variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
 * Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 * */

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int peso, e, m;
		
		
		System.out.println("\t\tDigite o peso dos tomates:");
		peso = leia.nextInt();
		
		if(peso > 50) {
			e = peso - 50;
			m = e * 4;
			System.out.println("\nExcedeu o limite do peso " + e + "kg a mais" + ", multa de: " + m + " reais");
		}else {
			e = 0;
			m = 0;
			System.out.println("\nExcedeu o limite do peso " + e + "kg a mais" + ", multa de: " + m + " reais");
			System.out.println("\nEsta dentro das limitações.");
		}
	}
}
