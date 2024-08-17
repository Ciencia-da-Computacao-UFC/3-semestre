package model;

public class Onibus extends Veiculo{
	private int numeroPassageiros;
	private int numeroEixos;
	
	public Onibus(){
		super();
	}

	public Onibus(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria, int situacao, int numeroPassageiros, int numeroEixos) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao);
		this.numeroPassageiros = numeroPassageiros;
		this.numeroEixos = numeroEixos;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}
	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	
	public int getNumeroEixos() {
		return numeroEixos;
	}
	public void setNumeroEixos(int numeroEixos) {
		this.numeroEixos = numeroEixos;
	}
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Número de passageiros: "+numeroPassageiros+"\n";
		aux += "Número de Eixos: "+numeroEixos+"\n\n";
		return aux;
	}
}
