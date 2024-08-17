package questao05;

import java.util.Scanner;

import jdk.internal.org.objectweb.asm.tree.analysis.Frame;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		int acao = 0;
		 
		while (!false) {
			System.out.println("--MENU--\n" + "1-Listar Funcionário \n" + "2-Solicitar Empréstimo \n"
					+ "3-Pagar Empréstimo \n" + "4-Demitir Funcionário \n" + "5-Sair\n");
			acao = scan.nextInt();
			switch (acao) {

			case 1:
				Banco.listarfuncionario();
				break;
			case 2:
				Banco.solicitaremprestimo();
				break;
			case 3:
				Banco.solicitaremprestimo();
				break;
			case 4:
				Banco.demitirfuncionario();
				break;
			case 5:
				for(int i = 0; i < 25; i++)
		            System.out.println("");
				System.exit(0);
				 
				break;
			}
		}
		
	}
}
	
