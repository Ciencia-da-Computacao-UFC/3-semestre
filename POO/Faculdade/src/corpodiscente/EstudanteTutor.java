package corpodiscente;

public class EstudanteTutor extends Estudante {
	private String disciplina;
	private float bolsa;
	
	public EstudanteTutor(String nome, int matricula, char sexo, int num_notas, String disciplina, float bolsa) {
		super(nome, matricula, sexo, num_notas);
		this.disciplina = disciplina;
		this.bolsa = bolsa;
	}
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	public void tiraDuvidas() {
		System.out.println("Estudante "+this.nome+ " esta tirando duvidas");
	}
	
	public void auxiliarProfessor() {
		System.out.println("Estudante fazendo o material");
	}

}
