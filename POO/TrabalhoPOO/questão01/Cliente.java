package questão01;

public class Cliente {
	//private String nome;
	private double renda;
	private Emprestimo emprestimo;
	
	public Cliente(double renda, Emprestimo emprestimo) {
		this.emprestimo=emprestimo;
		this.renda=renda;
	}
	
	public boolean verificarEmprestimo() {
		if(emprestimo.getValorEmprestado()<(0.4*renda)) {
			return true;
		}
			return false;
	}
	
	public void calcularJuros() {
		double[] aux = new double [emprestimo.getNumPrestacao()];
		if(emprestimo.getValorEmprestado()<(0.3*renda)) {
			emprestimo.setValorPorcentagem(10);
			emprestimo.setValorRestante(emprestimo.getValorEmprestado());
			emprestimo.setNumPrestacao((int)(emprestimo.getValorEmprestado()/emprestimo.getValorDaParcela()));
			for(int i=0; i<emprestimo.getNumPrestacao(); i++) {
				aux[i]=(emprestimo.getValorRestante()*0.1);
				emprestimo.setValorRestante(emprestimo.getValorRestante()-emprestimo.getValorDaParcela());
			}
			emprestimo.setPorcentagemJuros(aux);
		}else if(emprestimo.getValorEmprestado()>=(0.31*renda) || emprestimo.getValorEmprestado()<=(0.80*renda)) {
			emprestimo.setValorPorcentagem(15);
			emprestimo.setValorRestante(emprestimo.getValorEmprestado());
			emprestimo.setNumPrestacao((int)(emprestimo.getValorEmprestado()/emprestimo.getValorDaParcela()));
			for(int i=0; i<emprestimo.getNumPrestacao(); i++) {
				aux[i]=(emprestimo.getValorRestante()*0.15);
				emprestimo.setValorRestante(emprestimo.getValorRestante()-emprestimo.getValorDaParcela());
			}
			emprestimo.setPorcentagemJuros(aux);

		}else {
			emprestimo.setValorPorcentagem(20);
			emprestimo.setValorRestante(emprestimo.getValorEmprestado());
			emprestimo.setNumPrestacao((int)(emprestimo.getValorEmprestado()/emprestimo.getValorDaParcela()));
			for(int i=0; i<aux.length; i++) {
				aux[i]=(emprestimo.getValorRestante()*0.2);
				emprestimo.setValorRestante(emprestimo.getValorRestante()-emprestimo.getValorDaParcela());
			}
			emprestimo.setPorcentagemJuros(aux);

		}
		imprimirEmprestimo();
	}
	
	public void imprimirEmprestimo() {
		double acumula =0;
		double restante = emprestimo.getValorEmprestado();
		System.out.println("Renda Mensal: "+this.renda);
		System.out.println("Valor Emprestimo: "+this.emprestimo.getValorEmprestado());
		System.out.println("Juros de "+emprestimo.getValorPorcentagem()+" ao Mes");
		System.out.println("Total de prestações: "+emprestimo.getNumPrestacao()+" de "+emprestimo.getValorDaParcela()+" + juros");
		for(int i=0; i<emprestimo.getNumPrestacao(); i++) {
			acumula = emprestimo.getPorcentagemJuros()[i]+acumula;	
			double aux = emprestimo.getValorDaParcela() + emprestimo.getPorcentagemJuros()[i];
			System.out.println((i+1)+" prestação valor "+aux+", juros R$ "+emprestimo.getPorcentagemJuros()[i]+", juros acumulado R$ "+acumula +", valor restante R$ "+restante);
			restante = restante-emprestimo.getValorDaParcela();
		}
	}
}
