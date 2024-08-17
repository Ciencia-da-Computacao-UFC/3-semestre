package questao05;

import questão01.Cliente;
import questão01.Emprestimo;

import java.util.Scanner;

import questao05.Funcionario;

public class Banco {

	public static void listarfuncionario() {
		System.out.println("Funcionários: ");
		Funcionario f1 = new Funcionario();

		f1.setId(1);
		f1.setNome("Rodrigo");
		f1.setTemposervico(5);
		f1.setSituacaosempresa("Ativo");
		f1.setInfoemprestimo("Sem empréstimo a pagar");
		System.out.println("Id: " + f1.getId() + "\n" + "Nome: " + f1.getNome() + "\n" + "Tempo de Serviço: "
				+ f1.getTemposervico() + "\n" + "Situação na empresa: " + f1.getSituacaosempresa() + "\n"
				+ "Informaçãoes de empréstimo: " + f1.getInfoemprestimo() + "\n" + "\n");

		Funcionario f2 = new Funcionario();

		f2.setId(2);
		f2.setNome("Marcos");
		f2.setTemposervico(5);
		f2.setSituacaosempresa("Ativo");
		f2.setInfoemprestimo("Sem empréstimo a pagar");
		System.out.println("Id: " + f2.getId() + "\n" + "Nome: " + f2.getNome() + "\n" + "Tempo de Serviço: "
				+ f2.getTemposervico() + "\n" + "Situação na empresa: " + f2.getSituacaosempresa() + "\n"
				+ "Informaçãoes de empréstimo: " + f2.getInfoemprestimo() + "\n" + "\n");

		Funcionario f3 = new Funcionario();

		f3.setId(3);
		f3.setNome("Maria");
		f3.setTemposervico(5);
		f3.setSituacaosempresa("Ativo");
		f3.setInfoemprestimo("Sem empréstimo a pagar");
		System.out.println("Id: " + f3.getId() + "\n" + "Nome: " + f3.getNome() + "\n" + "Tempo de Serviço: "
				+ f3.getTemposervico() + "\n" + "Situação na empresa: " + f3.getSituacaosempresa() + "\n"
				+ "Informaçãoes de empréstimo: " + f3.getInfoemprestimo() + "\n" + "\n");

		Funcionario f4 = new Funcionario();

		f4.setId(4);
		f4.setNome("Bruna");
		f4.setTemposervico(5);
		f4.setSituacaosempresa("Ativo");
		f4.setInfoemprestimo("Sem empréstimo a pagar");
		System.out.println("Id: " + f4.getId() + "\n" + "Nome: " + f4.getNome() + "\n" + "Tempo de Serviço: "
				+ f4.getTemposervico() + "\n" + "Situação na empresa: " + f4.getSituacaosempresa() + "\n"
				+ "Informaçãoes de empréstimo: " + f4.getInfoemprestimo() + "\n" + "\n");

		Funcionario f5 = new Funcionario();

		f5.setId(5);
		f5.setNome("Junior");
		f5.setTemposervico(2);
		f5.setSituacaosempresa("Ativo");
		f5.setInfoemprestimo("Sem empréstimo a pagar");
		System.out.println("Id: " + f5.getId() + "\n" + "Nome: " + f5.getNome() + "\n" + "Tempo de Serviço: "
				+ f5.getTemposervico() + "\n" + "Situação na empresa: " + f5.getSituacaosempresa() + "\n"
				+ "Informaçãoes de empréstimo: " + f5.getInfoemprestimo() + "\n" + "\n");
	}

	public static void solicitaremprestimo() {
		System.out.println("Que emprestimo deseja fazer? 1-Normal | 2-Consignado");
		Scanner scan = new Scanner(System.in);
		int acao = scan.nextInt();
		int emprestNormal, emprestConsig;
		if(acao==1) {
			System.out.println("Empréstimo normal");
			//teste
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
		
			class Emprestimo {
				private double valorEmprestado;
				private double valorDaParcela;	
				private int numPrestacao;
				private double porcentagemJuros[] = new double[numPrestacao] ;
				private double valorPorcentagem;
				public double getValorPorcentagem() {
					return valorPorcentagem;
				}


				public void setValorPorcentagem(double valorPorcentagem) {
					this.valorPorcentagem = valorPorcentagem;
				}

				private double valorRestante;
				
				public Emprestimo(double valorEmprestado, double valorDaParcela) {
					this.valorEmprestado=valorEmprestado;
					this.valorDaParcela=valorDaParcela;
					this.valorRestante=valorEmprestado;
					this.numPrestacao=((int)(valorEmprestado/valorDaParcela));
					
				}

				
				public double getValorEmprestado() {
					return valorEmprestado;
				}

				

				public void setValorEmprestado(double valorEmprestado) {
					this.valorEmprestado = valorEmprestado;
				}



				public double getValorDaParcela() {
					return valorDaParcela;
				}

				public void setValorDaParcela(double valorDaParcela) {
					this.valorDaParcela = valorDaParcela;
				}

				public double[] getPorcentagemJuros() {
					return porcentagemJuros;
				}

				public void setPorcentagemJuros(double[] porcentagemJuros) {
					this.porcentagemJuros = porcentagemJuros;
				}

				public int getNumPrestacao() {
					return numPrestacao;
				}

				public void setNumPrestacao(int numPrestacao) {this.numPrestacao = numPrestacao;}

				public double getValorRestante() {return valorRestante;}

				public void setValorRestante(double valorRestante) {this.valorRestante = valorRestante;}
					
			}
			
			//teste	
			}else {
				System.out.println("Empréstimo consignado");

			}
		 
			
		

	}

	public static void pagarprestação() {
		

	}


	public static void demitirfuncionario() {
		System.out.println("Qual funcionário que demitir?\n Digite 666 para voltar");
		Scanner scan = new Scanner(System.in); 
		while(!false) {
		int acao = scan.nextInt();
		switch (acao) {

		case 1:
			Funcionario.f1 = setSituacaosempresa("Demitido");
			System.out.println("Demitido!");
			
			
			break;
		case 2:
			Funcionario.f2 = setSituacaoempresa("Demitido");
			System.out.println("Demitido!");
			break;
		case 3:
			 Funcionario.f3 = setSituacaoempresa("Demitido");
			 System.out.println("Demitido!");
			break;
		case 4:
			Funcionario.f4 = setSituacaoempresa("Demitido");
			System.out.println("Demitido!");
			break;
		case 5:
			Funcionario.f5 = setSituacaoempresa("Demitido");	
			System.out.println("Demitido!");
			break;
		case 666:
				for(int i = 0; i < 25; i++)
		            System.out.println("");
				System.exit(0);
		}
		
	}

}

	private static Object setSituacaoempresa(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object setSituacaosempresa(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}