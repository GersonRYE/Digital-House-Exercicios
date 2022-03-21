package TEstesClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes1 {

	public static void main(String[] args) {
		// Criação da lista
		// integer = inteiro
		List<Integer> minhaLista = new ArrayList<Integer>();

		// Inserção dos elementos do meu ArrayList --> minhaLista
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(8);
		minhaLista.add(5);
		minhaLista.add(1);

		// For each - percorre todos os elementos da lista
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}

		System.out.println("\nRemovendo um elemento da lista...");
		System.out.println();

		minhaLista.remove(0);

		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}

		// pegar um elemento da minha lista através do seu indice
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento da minha lista é: " + primeiroElemento);

		System.out.println();// limpando o cash de memoria

		for (int i = 0; i < minhaLista.size(); i++) {
			System.out.println("\nElemento: " + minhaLista.get(i));
		}

		// Ordena a lista em ordem crescente
		Collections.sort(minhaLista);
		System.out.println("Lista crescente: " + minhaLista);

		System.out.println();// limpando cash de memoria

		Set<Integer> meuSet = new HashSet<Integer>();

		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(2);

		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		System.out.println("Lista ordenada sem valores duplicados: ");
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
		}
	}

}
