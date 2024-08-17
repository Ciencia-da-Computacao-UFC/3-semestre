package veiculo;

public class VeiculoUtilitario extends Veiculo{
	private String tipotracao;
	private boolean possui_ts;
	private float d_aro;
	private String tipo;
	
	
	public VeiculoUtilitario(String placa, String cor, String modelo, String fabricante, String data_fabric, float valor_diaria, String situacao, String tipotracao, boolean possui_ts, float d_aro, String tipo) {
		super(placa, cor, modelo, fabricante, data_fabric, valor_diaria, situacao);
		this.tipotracao = tipotracao;
		this.possui_ts = possui_ts;
		this.d_aro = d_aro;
		this.tipo = tipo;
		
	}


	public String getTipotracao() {
		return tipotracao;
	}


	public void setTipotracao(String tipotracao) {
		this.tipotracao = tipotracao;
	}


	public boolean isPossui_ts() {
		return possui_ts;
	}


	public void setPossui_ts(boolean possui_ts) {
		this.possui_ts = possui_ts;
	}


	public float getD_aro() {
		return d_aro;
	}


	public void setD_aro(float d_aro) {
		this.d_aro = d_aro;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}


	