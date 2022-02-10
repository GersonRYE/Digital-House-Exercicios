package LacosRepeticao;

import java.util.Scanner;

/*
 * 4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma 
 * regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
�	o n�mero de pessoas calmas; 
�	o n�mero de mulheres nervosas; 
�	o n�mero de homens agressivos; 
�	o n�mero de outros calmos;
�	o n�mero de pessoas nervosas com mais de 40 anos; 
�	o n�mero de pessoas calmas com menos de 18 anos.
*/

public class Exercicio4While {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int qtd = 0, idade = 0, m = 0, f = 0, o = 0, sexo = 0, comportamento = 0, pc = 0, pn = 1, pa = 1, mn = 0, ha = 0, oc = 0, c40 = 0, c18 = 0;
		boolean validandoIdade = true; //validandoSexo = true, validandoEmocional = true;

		while (qtd < 3) {

			while (validandoIdade) {
				System.out.println("Digite a " + (qtd + 1) + "� idade: ");
				idade = leia.nextInt();
				if (idade >= 0) {
					System.out.println("Carregando...");
					break;
				} else {

					System.out.println("Idade Inv�lida!!!");
				}

			}

			while (sexo == 0) {
				System.out.println("\nEscolha uma das op��es referente ao seu sexo: ");
				System.out.println("Digite 1 - Masculino");
				System.out.println("Digite 2 - Feminino");
				System.out.println("Digite 3 - Outros");
				sexo = leia.nextInt();

				switch (sexo) {
				case 1:
					m++;
					break;
				case 2:
					f++;
					break;
				case 3:
					o++;
					break;
				default:
					System.out.println("Op��o inv�lida");
					sexo = 0;
					break;
				}

			}

			while (comportamento == 0) {
				System.out.println("\nEscolha uma das op��es referente ao seu status emocional: ");
				System.out.println("Digite 1 - Pessoa Calma");
				System.out.println("Digite 2 - Pessoa Nervosa");
				System.out.println("Digite 3 - Pessoa Agressiva");
				comportamento = leia.nextInt();

				switch (comportamento) {
				case 1:
					pc++;
					break;
				case 2:
					pn++;
					break;
				case 3:
					pa++;
					break;
				default:
					System.out.println("Op��o inv�lida!!!");
					comportamento = 0;
					break;
				}

			}

			qtd++;
			
			if(sexo == 2 && comportamento == 2) {
				mn++;
			}
			
			if(sexo == 1 && comportamento == 3) {
				ha++;
			}
			
			if(sexo == 3 && comportamento == 1) {
				oc++;
			}
			if(comportamento == 1 && idade >= 40) {
				c40++;
			}
			if(comportamento == 1 && idade <= 18) {
				c18++;
			}
			
			idade = -1;
			sexo = 0;
			comportamento = 0;
			
leia.close();

		}
		
		System.out.println("Quantidade de pessoas calmas: " + pc);
		System.out.println("Quantidade de mulheres nervosas: " + mn);
		System.out.println("Quantidade de homens agressivos: " + ha);
		System.out.println("Quantidade de outros calmos: " + oc);
		System.out.println("Quantidade de pessoas com mais de 40 anos calmos " + c40);
		System.out.println("Quantidade de pessoas com menos de 18 anos calmos: " + c18);
		
		

	}

}
