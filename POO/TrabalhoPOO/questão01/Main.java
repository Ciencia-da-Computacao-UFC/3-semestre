package questão01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double valorEmprestado=0, valorDaParcela=0, renda=0;
		Scanner var = new Scanner(System.in);
		System.out.println("Digite o valor que deseja emprestar");
		valorEmprestado= var.nextDouble();
		System.out.println("Digite o valor da sua parcela");
		valorDaParcela = var.nextDouble();
		System.out.println("Digite o valor da sua renda");
		renda = var.nextDouble();
		
		Emprestimo e1 = new Emprestimo(valorEmprestado, valorDaParcela);
		Cliente c1 = new Cliente(renda, e1);
		
		if(c1.verificarEmprestimo()==true) {
			System.out.println("Emprestimo autorizado!");
			c1.calcularJuros();
		}else {
			System.out.println("Emprestimo Negado!");
		}
	
	}
}
