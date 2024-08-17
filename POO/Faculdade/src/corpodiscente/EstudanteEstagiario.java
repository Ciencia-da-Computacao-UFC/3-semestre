package corpodiscente;

public class EstudanteEstagiario extends Estudante{
	private String empresa;
	private float bolsaSalario;
	
	public EstudanteEstagiario(String nome, int matricula, char sexo, int num_notas, String empresa, float bolsaSalario) {
		super(nome, matricula, sexo, num_notas);
		this.empresa = empresa;
		this.bolsaSalario = bolsaSalario;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public float getBolsaSalario() {
		return bolsaSalario;
	}

	public void setBolsaSalario(float bolsaSalario) {
		this.bolsaSalario = bolsaSalario;
	}
	
	public void trabalhar() {
		System.out.println("Estudante Trabalhando");
	}
}
