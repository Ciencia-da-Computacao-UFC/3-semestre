package veiculo;

public class Onibus extends Veiculo{
	private int num_pas;
	private int num_eixos;
	public Onibus(String placa, String cor, String modelo, String fabricante, String data_fabric, float valor_diaria, String situacao, int num_pas, int num_eixos) {
		super(placa, cor, modelo, fabricante, data_fabric, valor_diaria, situacao);
		this.num_pas = num_pas;
		this.num_eixos = num_eixos;
	}
	public int getNum_pas() {
		return num_pas;
	}
	public void setNum_pas(int num_pas) {
		this.num_pas = num_pas;
	}
	public int getNum_eixos() {
		return num_eixos;
	}
	public void setNum_eixos(int num_eixos) {
		this.num_eixos = num_eixos;
	}
		
}
