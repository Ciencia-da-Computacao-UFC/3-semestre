package model;

public class Passeio extends Veiculo{
	private int numeroPortas;
	private boolean arCondicionado;
	private boolean direcaoHidraulica;
	
	public Passeio(){
		super();
	}

	public Passeio(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria,int situacao, int numeroPortas, boolean arCondicionado, boolean direcaoHidraulica) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao);
		this.numeroPortas = numeroPortas;
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}
	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Número de portas: "+numeroPortas+"\n";
		aux += "Ar-condicionado: "+((arCondicionado) ? "Sim" : "Não")+"\n";
		aux += "Direção hidráulica: "+((direcaoHidraulica) ? "Sim" : "Não")+"\n\n";
		return aux;
	}
}
