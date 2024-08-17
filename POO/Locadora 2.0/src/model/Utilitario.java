package model;

public class Utilitario extends Veiculo{
	private String tipoTracao;
	private boolean tetoSolar;
	private double diametroAro;
	private int tipo;
	
	public Utilitario(){
		super();
	}
	
	public Utilitario(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria, int situacao, String tipoTracao, boolean tetoSolar, double diametroAro, int tipo) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao);
		this.tipoTracao = tipoTracao;
		this.tetoSolar = tetoSolar;
		this.diametroAro = diametroAro;
		this.tipo = tipo;
	}

	public String getTipoTracao() {
		return tipoTracao;
	}
	public void setTipoTracao(String tipoTracao) {
		this.tipoTracao = tipoTracao;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}
	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public double getDiametroAro() {
		return diametroAro;
	}
	public void setDiametroAro(double diametroAro) {
		this.diametroAro = diametroAro;
	}

	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Tipo da traçao: "+tipoTracao+"\n";
		aux += "Teto solar: "+((tetoSolar) ? "Sim" : "Não")+"\n";
		aux += "Diametro do aro: "+diametroAro+"\n";
		aux += "Tipo: "+((tipo == 0) ? "Urbano" : "Off-Road")+"\n\n";
		return aux;
	}
}
