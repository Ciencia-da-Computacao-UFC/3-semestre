package controller;

import java.util.ArrayList;
import java.util.List;

import model.Aluguel;

public class AluguelController extends Controller{
	private static AluguelController controller;
	
	private AluguelController(){
		super();
	}
	
	public static AluguelController getInstance(){
		if(controller == null)
			controller = new AluguelController();
		return controller;
	}
	
	public List<Aluguel> buscarAluguelCarro(String placa) throws Exception{
		List<Aluguel> aux = new ArrayList<>();
		this.historico.getAlugueis().forEach((aluguelAux) -> {
			if(aluguelAux.getVeiculo().getPlaca().equals(placa))
				aux.add(aluguelAux);
		});
		this.historico.getAlugueisAtivos().forEach((aluguelAux) -> {
			if(aluguelAux.getVeiculo().getPlaca().equals(placa))
				aux.add(aluguelAux);
		});
		if (aux.isEmpty())
			throw new Exception("Veiculos com essa placa não foram alugados");
		else
			return aux;
	}

	public void alugar(Aluguel aluguel) throws Exception {
		if(aluguel.getVeiculo().getSituacao() == 0)
			this.historico.getAlugueisAtivos().add(aluguel);
		else
			throw new Exception("Carro indisponivel");
	}
	
	public void alterarValorDoAluguel(Aluguel aluguel){
		for(int i=0; i<this.historico.getAlugueisAtivos().size(); i++){
			if(this.historico.getAlugueisAtivos().get(i).getVeiculo().getPlaca().equals(aluguel.getVeiculo().getPlaca())){
				this.historico.getAlugueisAtivos().remove(i);
				this.historico.getAlugueis().add(aluguel);
			}
		}
	}
	
	public Aluguel buscarAluguel(String placa) throws Exception{
		for(Aluguel aux : this.historico.getAlugueisAtivos()){
			if(aux.getVeiculo().getPlaca().equals(placa)){
				return aux;
			}
		}
		throw new Exception("Veiculo não encontrado");
	}
}
