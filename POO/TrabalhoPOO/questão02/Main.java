package questão02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int numFuncionarios = 0;
		System.out.println("Digite o número de funcionarios");
		numFuncionarios = num.nextInt();
		Empresa e1 = new Empresa(numFuncionarios);
		e1.imprimir();
	}
}