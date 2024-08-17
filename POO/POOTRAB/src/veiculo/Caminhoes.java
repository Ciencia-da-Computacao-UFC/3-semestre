package veiculo;

public class Caminhoes extends Veiculo{
	private float cap_carg;
	private int num_eixo;
	private int potencia;
	public Caminhoes(String placa, String cor, String modelo, String fabricante, String data_fabric, float valor_diaria, String situacao, float cap_carg, int num_eixo, int potecia) {
		super(placa, cor, modelo, fabricante, data_fabric, valor_diaria, situacao);
		this.cap_carg = cap_carg;
		this.num_eixo = num_eixo;
		this.potencia = potecia;
	}
	public float getCap_carg() {
		return cap_carg;
	}
	public void setCap_carg(float cap_carg) {
		this.cap_carg = cap_carg;
	}
	public int getNum_eixo() {
		return num_eixo;
	}
	public void setNum_eixo(int num_eixo) {
		this.num_eixo = num_eixo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
		
}
