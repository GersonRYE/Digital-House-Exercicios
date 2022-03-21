package TEstesClasses;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteSenha {
	public static void main(String[] args) {
		String login = JOptionPane.showInputDialog("Digite o login");
		String senha = JOptionPane.showInputDialog("Digite a senha");
		int cont = 1;

		
		
		while (!senha.equals("senha123") && cont <= 2) {
			senha = JOptionPane.showInputDialog("Senha incorreta, Tente Novamente!!!" + (3-cont));
			cont++;
		}
		
		System.out.println();
		if(senha.equals("senha123")) {
			JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
		}else {
			JOptionPane.showMessageDialog(null, "ACESSO BLOQUEADO(senha incorreta)");
		}
		
	}
}
