package model;

public class Cliente {
	private String nome;
	
	public Cliente(){
		super();
	}
	
	public Cliente(String nome){
		this();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+"\n";
	}
}
