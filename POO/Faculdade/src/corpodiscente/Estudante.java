package corpodiscente;

public class Estudante {
	protected String nome;
	protected int matricula;
	protected char sexo;
	protected float[] notas;
	
	public Estudante(String nome, int matricula, char sexo, int num_notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.sexo = sexo;
		this.notas = new float[num_notas];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	public void exibir() {
		System.out.println("Estudante : "+ nome);
		System.out.println("Matricula : "+ matricula);
		System.out.println("Sexo : "+ sexo);
	}
	
	public void atribuirNota(int prova, float nota) {
		notas[prova-1] = nota;
	}
	
	public void lerNotas(int prova) {
		System.out.println("Prova "+ prova+ " = "+notas[prova-1]);
	}
	
	public float calcularMedia() {
		float media = 0;
		for(int i =0; i < notas.length; i++) {
			media = media + notas[i];
		}
		return media/notas.length;
	}
}
