package questão02;

public class Funcionario {
	double salario;
	
	private Funcionario() {}
	public Funcionario(double x) {
		this.salario = x;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
} 
