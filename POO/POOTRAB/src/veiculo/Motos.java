package veiculo;

public class Motos extends Veiculo{
	private int potencia;
	private String tipo;
	
	
	public Motos(String placa, String cor, String modelo, String fabricante, String data_fabric, float valor_diaria, String situacao, int potencia, String tipo) {
		super(placa, cor, modelo, fabricante, data_fabric, valor_diaria, situacao);
		this.potencia = potencia;
		this.tipo = tipo;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		tipo = tipo;
	}
	
}
