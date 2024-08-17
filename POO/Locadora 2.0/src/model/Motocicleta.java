package model;

public class Motocicleta extends Veiculo{
	private String potencia;
	private int tipo;

	public Motocicleta(){
		super();
	}

	public Motocicleta(String placa, String cor, String modelo, String fabricante, int anoFabricacao, double valorDiaria, int situacao, String potencia, int tipo) {
		super(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao);
		this.potencia = potencia;
		this.tipo = tipo;
	}

	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
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
		aux +="potencia: "+potencia+"\n";
		aux += "Tipo: "+((tipo == 0) ? "Urbano" : ((tipo == 1) ?"Off-Road" : "Esportiva"))+"\n\n";
		return aux;
	}
}
