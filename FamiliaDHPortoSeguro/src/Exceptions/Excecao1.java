package Exceptions;

public class Excecao1 {

	public static void main(String[] args) {
		String frase = null;	
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) { // caotura da possivel exceção
			//tratamento da exceção
			System.out.println("\nA frase inical esta nula, para solucionar tal problema,"
					+ "foi lhe atribuido um valor default...");
			frase = "Agora tem algo aqui";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nNova frase: "+novaFrase);
	}

}
