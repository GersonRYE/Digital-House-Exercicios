package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int op = 0;

		ArrayList<String> estoque = new ArrayList<>();

		do {
			System.out.println("\n------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos no estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Para Sair do programa");
			System.out.println("\n------------------------------------------------");
			System.out.println("\n");
			System.out.println("Digite uma opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();// limpando o cash de memoria, deixar o sistema mais leve
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.err.println("\nDigite o produto para remover do estoque: ");
				String remover = leia.nextLine();
				if (estoque.contains(remover)) {
					estoque.remove(remover);
					System.out.println("\nO produto: " + remover + "foi removido do estoque! ");
				} else {
					System.out.println("\nProduto não existe!");
				}
				break;

			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrara no lugar do "+verifica);
				String novo = leia.nextLine();
				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nProduto não existe!!!");
				}

				System.out.println(estoque);
				break;

			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;

			default:
				if (op == 0) {
					System.out.println("Tchau");
				} else {
					System.out.println("\nOpção inválida");
				}

			}

		} while (op != 0);
		leia.close();
	}
}
