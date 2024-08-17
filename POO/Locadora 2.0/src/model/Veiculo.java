package model;

public abstract class Veiculo {
	private String placa;
	private String cor;
	private String modelo;
	private String fabricante;
	private int anoFabricacao;
	private double valorDiaria;
	private int situacao;
	
	public Veiculo(){
		super();
	}
	
	public Veiculo(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria,int situacao) {
		this();
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.anoFabricacao = anoFabricacao;
		this.valorDiaria = valorDiaria;
		this.situacao = situacao;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	
	@Override
	public String toString() {
		String aux;
		aux = "Placa :"+placa+"\n";
		aux += "Cor :"+cor+"\n";
		aux += "Modelo :"+modelo+"\n";
		aux += "Fabricante :"+fabricante+"\n";
		aux += "Ano de fabricação :"+anoFabricacao+"\n";
		aux += "Valor da diária :"+valorDiaria+"\n";
		aux += "Situação :"+ ((situacao == 0) ? "disponível" : (situacao == 1) ? "indiponível" : "manutençao")+"\n";
		return aux;
	}
}
