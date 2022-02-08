package PortoSeguro;

import java.awt.desktop.PrintFilesEvent;
import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade, x, y;
		double altura, nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\"Olá Mundo!!!\"");
		System.out.println("Por favor prezado usuário...\n\t\tEntre com o seu nome: ");
		nome = leia.nextLine();
		System.out.println("\n\t\tEntre com a sua altura: ");
		altura = leia.nextFloat();
		System.out.println("\n\t\tEntre com sua idade: ");
		idade = leia.nextInt();
		
		//System.out.println("\nMeu nome é: " + nome + " eu tenho: " + idade + " e minha altura é: " + altura);
		
		System.out.printf("\nMeu nome é: %s eu tenho: %d anos(a)"
				+ "e minha altura é: %d", nome, idade, altura);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat() ;
		
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nEntre com a terceira nota");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3)/ 3;
		
		System.out.printf("\nMédia aritmética: %2.2f", media);
		
		nota1 = Math.sqrt(nota2); //raiz quadrada
		
		nota2 = Math.pow(nota3, 3); // potencia
		

		System.out.println("\nEntre com o valor de X: ");
		x = leia.nextInt();
		
		System.out.println("\nEntre com o valor de Y");
		y = leia.nextInt();
		
		x = x % y;
		
		
	}

}
