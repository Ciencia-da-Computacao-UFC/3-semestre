package veiculo;

import java.util.Random;

public abstract class Veiculo {
	private String placa;
	private String cor;
	private String modelo;
	private String fabricante;
	private String data_fabric;
	private float valor_diaria;
	private String situacao;
	
	
	//construtor
	public Veiculo(String placa, String cor, String modelo, String fabricante, String data_fabric, float valor_diaria,
			String situacao) {
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.data_fabric = data_fabric;
		this.valor_diaria = valor_diaria;
		this.situacao = situacao;
	}
	
	//métodos acess. e modificadores
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
	public String getData_fabric() {
		return data_fabric;
	}
	public void setData_fabric(String data_fabric) {
		this.data_fabric = data_fabric;
	}
	public float getValor_diaria() {
		return valor_diaria;
	}
	public void setValor_diaria(float valor_diaria) {
		this.valor_diaria = valor_diaria;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	// Métodos do Menu
	public static String gerarPlaca() {
		String aux;
		String placa = "";
		char aux2;
		Random r = new Random();
		for(int f = 0; f < 3; f++) {
			aux2 = (char) ((char) r.nextInt(25) + 65);
			placa = placa + aux2;
		}
		placa = placa + "-";
		for(int f = 0; f< 4; f++) {
			aux = Integer.toString(r.nextInt(10));
			placa = placa.concat(aux);
		}
		return placa;
	}
	
}
