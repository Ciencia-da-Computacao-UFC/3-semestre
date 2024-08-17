package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.Veiculo;

public class VeiculoController extends Controller{
	private static VeiculoController controller;
	
	private VeiculoController(){
		super();
	}
	
	public static VeiculoController getInstance(){
		if(controller == null)
			controller = new VeiculoController();
		return controller;
	}
	
	public void cadastrar(Veiculo veiculo) throws Exception{
		if(veiculo.getAnoFabricacao() <= (Calendar.getInstance()).get(Calendar.YEAR))
			if(!checarPlaca(veiculo.getPlaca()))
				this.estoque.getVeiculos().add(veiculo);
			else
				throw new Exception("Veiculo já cadastrado");
		else
			throw new Exception("Ano de fabricação maior que o atual");
	}
	
	public List<Veiculo> buscarValor(double valor) throws Exception{
		List<Veiculo> aux = new ArrayList<>();
		this.estoque.getVeiculos().forEach((veiculoAux) -> {
			if(veiculoAux.getValorDiaria() == valor)
				aux.add(veiculoAux);
		});
		if (aux.isEmpty())
			throw new Exception("Veiculos com esse valor não foram encontrados");
		else
			return aux;
	}
	
	public List<Veiculo> buscarAno(int ano) throws Exception{
		List<Veiculo> aux = new ArrayList<>();
		this.estoque.getVeiculos().forEach((veiculoAux) -> {
			if(veiculoAux.getAnoFabricacao() == ano)
				aux.add(veiculoAux);
		});
		if (aux.isEmpty())
			throw new Exception("Veiculos com esse ano não foram encontrados");
		else
			return aux;
	}
	
	public List<Veiculo> buscarModelo(String modelo) throws Exception{
		List<Veiculo> aux = new ArrayList<>();
		this.estoque.getVeiculos().forEach((veiculoAux) -> {
			if(veiculoAux.getModelo().equals(modelo))
				aux.add(veiculoAux);
		});
		if (aux.isEmpty())
			throw new Exception("Veiculos com esse modelo não foram encontrados");
		else
			return aux;
	}
	
	public List<Veiculo> buscarMarca(String marca) throws Exception{
		List<Veiculo> aux = new ArrayList<>();
		this.estoque.getVeiculos().forEach((veiculoAux) -> {
			if(veiculoAux.getFabricante().equals(marca))
				aux.add(veiculoAux);
		});
		if (aux.isEmpty())
			throw new Exception("Veiculos com essa marca não foram encontrados");
		else
			return aux;
	}
	
	public Veiculo buscarPlaca(String placa) throws Exception{
		for(Veiculo aux : this.estoque.getVeiculos())
			if(aux.getPlaca().equals(placa))
				return aux;
		throw new Exception("Veiculo não encontrado");
	}
	
	public List<Veiculo> listarCarrosDisponiveis() throws Exception{
		List<Veiculo> aux = new ArrayList<>();
		this.estoque.getVeiculos().forEach((veiculoAux) -> {
			if(veiculoAux.getSituacao() == 0)
				aux.add(veiculoAux);
		});
		if (aux.isEmpty())
			throw new Exception("Nenhum veiculo disponível");
		else
			return aux;
	}

	public List<Veiculo> listarCarrosIndisponiveis() throws Exception{
		List<Veiculo> aux = new ArrayList<>();
		this.estoque.getVeiculos().forEach((veiculoAux) -> {
			if(veiculoAux.getSituacao() == 1)
				aux.add(veiculoAux);
		});
		if (aux.isEmpty())
			throw new Exception("Todos os carros estão disponíveis");
		else
			return aux;
	}
	
	private boolean checarPlaca(String placa){
		for (Veiculo aux : this.estoque.getVeiculos())
			if(aux.getPlaca().equals(placa))
				return true;
		return false;
	}
	
	public void mudarStatusAlugado(String placa) throws Exception{
		for(int i=0; i<this.estoque.getVeiculos().size(); i++)
			if(this.estoque.getVeiculos().get(i).getPlaca().equals(placa)){
				this.estoque.getVeiculos().get(i).setSituacao(1);
				return;
			}
		throw new Exception("Veiculo não encontrado");
	}
	
	public void mudarStatusDisponivel(String placa) throws Exception{
		for(int i=0; i<this.estoque.getVeiculos().size(); i++)
			if(this.estoque.getVeiculos().get(i).getPlaca().equals(placa)){
				this.estoque.getVeiculos().get(i).setSituacao(0);
				return;
			}
		throw new Exception("Veiculo não encontrado");
	}
	
	public void mudarStatusManutencao(String placa) throws Exception{
		for(int i=0; i<this.estoque.getVeiculos().size(); i++)
			if(this.estoque.getVeiculos().get(i).getPlaca().equals(placa)){
				this.estoque.getVeiculos().get(i).setSituacao(2);
				return;
			}
		throw new Exception("Veiculo não encontrado");
	}
}
