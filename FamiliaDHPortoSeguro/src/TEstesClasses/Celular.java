package TEstesClasses;

public class Celular extends Telefone {
	public Celular() {
		super("Telefone Celular");
	}

	@Override //Anota��o indicada para sobrescrever o metodo do abstrato
	public void toca(int codigoToque) {
		switch (codigoToque) {
		case 1:
			System.out.println("\nShalamar...Shalamar ");
			break;
		case 2:
			System.out.println("\nTaninanana...Tananinana...");
			break;
		default:
			System.out.println("\nTa...Tanana...Tanana...");
		}
	}

	@Override //Anota��o indicada para sobrescrever o metodo do abstrato
	public void disca(String numero) {
		System.out.println("\nO n�mero: " + numero + " � um celular...");
	}
}
