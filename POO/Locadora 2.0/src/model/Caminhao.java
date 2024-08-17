package model;

public class Caminhao extends Veiculo{
	private double capacidadeCarga;
	private int numeroEixos;
	private String potencia;
	
	public Caminhao(){
		super();
	}

	public Caminhao(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria, int situacao, double capacidadeCarga, int numeroEixos, String potencia) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao);
		this.capacidadeCarga = capacidadeCarga;
		this.numeroEixos = numeroEixos;
		this.potencia = potencia;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidaCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getNumeroEixos() {
		return numeroEixos;
	}
	public void setNumeroEixos(int numeroEixos) {
		this.numeroEixos = numeroEixos;
	}

	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Capacidade de carga: "+capacidadeCarga+"\n";
		aux += "Número de eixos: "+numeroEixos+"\n";
		aux += "Potencia: "+potencia+"\n\n";
		return aux;
	}
}
