package PortoSeguro;

import java.util.Scanner;

public class Arrayteste {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] media = new float[5];// separar o array das variáveis comuns
		float n1, n2, n3, somaMedia = 0, mediaGeral;
		int x, aprovados = 0, reprovados = 0;
		String[] nome = new String[5];

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 5; x++) {

			System.out.println("\nNotas do aluno " + (x + 1));
			System.out.println("\nEntre com o nome do aluno: ");
			nome[x] = leia.nextLine();

			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			while (n1 < 0 || n1 > 10) {
				System.out.println("\nIntervalo de notas errado...\nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
			}
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			while (n2 < 0 || n2 > 10) {
				System.out.println("\nIntervalo de notas errado...\nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
			}
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			while (n3 < 0 || n3 > 10) {
				System.out.println("\nIntervalo de notas errado...\nEntre com a terceira nota: ");
				n3 = leia.nextFloat();
			}

			media[x] = (n1 + n2 + n3) / 3;
			if (media[x] > 7 && media[x] <= 10) {
				System.out.println("\nAluno aprovado!!!");
				aprovados++;
			} else if (media[x] >= 5 && media[x] < 7) {
				System.out.println("\nAluno de exame!!!");
			} else {
				System.out.println("\nAluno reprovado!!!");
				reprovados++;
			}

			System.out.println("O aluno " + nome[x] + " ficou com a média " + media[x]);
			somaMedia += media[x];
			
			
		
			
		}

		mediaGeral = somaMedia / x;

		System.out.println("A média geral é " + mediaGeral);
		System.out.println("\nTivemos " + aprovados + " alunos aprovados");
		System.out.println("\nTivemos " + reprovados + " alunos reprovados");
	}

}
