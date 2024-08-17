package questao05;

public class Funcionario {
	public static Object f1;
	public static Object f2;
	public static Object f3;
	public static Object f4;
	public static Object f5;
	public int id;
	public String nome;
	public int temposervico;
	public String situacaosempresa;
	public String infoemprestimo;
	
	public Funcionario() {
		this.id=id;
		this.nome = nome;
		this.temposervico=temposervico;
		this.situacaosempresa="Ativo";
		this.infoemprestimo="Sem empréstimo";
	}
	static void f1(){
	Funcionario f1 = new Funcionario();

	f1.setId(1);
	f1.setNome("Rodrigo");
	f1.setTemposervico(5);
	f1.setSituacaosempresa("Ativo");
	f1.setInfoemprestimo("Sem empréstimo a pagar");
	}
	void f2(){
	Funcionario f2 = new Funcionario();
	f2.setId(2);
	f2.setNome("Marcos");
	f2.setTemposervico(5);
	f2.setSituacaosempresa("Ativo");
	f2.setInfoemprestimo("Sem empréstimo a pagar");
	}
	
	void f3() {
		Funcionario f3 = new Funcionario();

		f3.setId(3);
		f3.setNome("Maria");
		f3.setTemposervico(5);
		f3.setSituacaosempresa("Ativo");
		f3.setInfoemprestimo("Sem empréstimo a pagar");
	}
	
	void f4() {
		Funcionario f4 = new Funcionario();

		f4.setId(4);
		f4.setNome("Bruna");
		f4.setTemposervico(5);
		f4.setSituacaosempresa("Ativo");
		f4.setInfoemprestimo("Sem empréstimo a pagar");
	}
	void f5() {
		Funcionario f5 = new Funcionario();

		f5.setId(5);
		f5.setNome("Junior");
		f5.setTemposervico(2);
		f5.setSituacaosempresa("Ativo");
		f5.setInfoemprestimo("Sem empréstimo a pagar");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTemposervico() {
		return temposervico;
	}

	public void setTemposervico(int temposervico) {
		this.temposervico = temposervico;
	}

	public String getSituacaosempresa() {
		return situacaosempresa;
	}

	public void setSituacaosempresa(String situacaosempresa) {
		this.situacaosempresa = situacaosempresa;
	}

	public String getInfoemprestimo() {
		return infoemprestimo;
	}

	public void setInfoemprestimo(String infoemprestimo) {
		this.infoemprestimo = infoemprestimo;
	}
	
	
}
