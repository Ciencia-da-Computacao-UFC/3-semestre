package veiculo;

public class VeiculosPasseio extends Veiculo{
	private int num_portas;
	private boolean p_arcond;
	private boolean p_direHi;
	
	public VeiculosPasseio(String placa, String cor, String modelo, String fabricante, String data_fabric, float valor_diaria, String situacao, int num_portas, boolean p_arcond, boolean p_direHi) {
		super(placa, cor, modelo, fabricante, data_fabric, valor_diaria, situacao);
		this.num_portas = num_portas;
		this.p_arcond = p_arcond;
		this.p_direHi = p_direHi;
		
	}

	public int getNum_portas() {
		return num_portas;
	}

	public void setNum_portas(int num_portas) {
		this.num_portas = num_portas;
	}

	public boolean isP_arcond() {
		return p_arcond;
	}

	public void setP_arcond(boolean p_arcond) {
		this.p_arcond = p_arcond;
	}

	public boolean isP_direHi() {
		return p_direHi;
	}

	public void setP_direHi(boolean p_direHi) {
		this.p_direHi = p_direHi;
	}
	
}