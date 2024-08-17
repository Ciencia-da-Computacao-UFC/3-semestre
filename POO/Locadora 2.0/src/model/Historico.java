package model;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	private List<Aluguel> alugueis = new ArrayList<>();
	private List<Aluguel> alugueisAtivos = new ArrayList<>();
	
	public Historico(){
		super();
	}

	public List<Aluguel> getAlugueis() {
		return alugueis;
	}
	public void setAlugueis(List<Aluguel> alugueis) {
		this.alugueis = alugueis;
	}
	
	public List<Aluguel> getAlugueisAtivos() {
		return alugueisAtivos;
	}
	public void setAlugueisAtivos(List<Aluguel> alugueis) {
		this.alugueisAtivos = alugueis;
	}
}
