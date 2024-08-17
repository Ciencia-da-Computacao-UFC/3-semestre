package quest�o02;

import java.util.Random;

public class Empresa {
	private Funcionario[] funcionario;

	public Empresa(int numFuncionarios) {
		funcionario = new Funcionario[numFuncionarios];
		for (int i = 0; i < numFuncionarios; i++) {
			funcionario[i]=new Funcionario(randomizarSalarios());
		}
	}

	public double randomizarSalarios() {
		Random random = new Random();
		double valorMin = 1500, valorMax = 3000;
		return valorMin + (valorMax - valorMin) * random.nextDouble();
	}

	public void imprimir() {
		double soma = 0;
		int contadorAcimaDaMedia = 0;
		System.out.println("N�mero de funcin�rios: " + funcionario.length);
		for (int i = 0; i < funcionario.length; i++) {
			System.out.println("Sal�rio do funcion�rio " + (i + 1) + " = " + funcionario[i].salario);
			soma = soma + funcionario[i].salario;
		}
		System.out.println("M�dia de Sal�rio = " + (soma / funcionario.length));

		for (int i = 0; i < funcionario.length; i++) {
			if (funcionario[i].salario > (soma / funcionario.length)) {
				contadorAcimaDaMedia++;
			}
		}
		System.out.println(
				"Atualmente " + contadorAcimaDaMedia + " funcion�rios recebem sal�rios acima da m�dia da empresa.");
	}

	public Funcionario[] getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
}
