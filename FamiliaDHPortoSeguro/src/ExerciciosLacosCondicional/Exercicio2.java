package ExerciciosLacosCondicional;

import java.util.Scanner;

/*
 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um 
 * operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder 
 * a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário 
 * excedente.
 * */

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int c, n, e;
			
		int salarioAtual, salarioExcedente;
		
		System.out.println("\nDigite seu código: ");
		c = leia.nextInt();
		
		System.out.println("\nDigite as horas trabalhadas");
		n = leia.nextInt();
		
		if(n > 50) {
			e = n - 50;
			salarioAtual = n * 10;
			salarioExcedente = (e * 20) + salarioAtual;
			
			System.out.println("Salario atual: " + salarioAtual + " reais");
			System.out.println("Salario excedente: " + salarioExcedente + " reais");
		}
		else {
			salarioAtual = n * 10;
			salarioExcedente = 0;
			System.out.println("Salário atual: " + salarioAtual + " reais");
			System.out.println("Salário excedente: " + salarioExcedente + " reais");
		}
	}

}
