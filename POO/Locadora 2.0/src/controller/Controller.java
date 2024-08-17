package controller;

import model.*;

abstract class Controller {
	Aluguel aluguel;
	Caminhao caminhao;
	Cliente cliente;
	Estoque estoque;
	Historico historico;
	Motocicleta motocicleta;
	Onibus onibus;
	Passeio passeio;
	Utilitario utilitario;
	Veiculo veiculo;
	
	public Controller(){
		aluguel = new Aluguel();
		caminhao = new Caminhao();
		cliente = new Cliente();
		estoque = new Estoque();
		historico = new Historico();
		motocicleta = new Motocicleta();
		onibus = new Onibus();
		passeio = new Passeio();
		utilitario = new Utilitario();
	}
}
