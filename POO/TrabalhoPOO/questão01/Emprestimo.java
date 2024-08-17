package questão01;

public class Emprestimo {
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
