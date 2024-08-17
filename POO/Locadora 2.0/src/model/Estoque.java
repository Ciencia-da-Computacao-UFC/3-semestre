package model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private static List<Veiculo> veiculos = new ArrayList<>();
	
	public Estoque(){
		super();
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public static void setVeiculos(List<Veiculo> veiculos) {
		Estoque.veiculos = veiculos;
	}
}
