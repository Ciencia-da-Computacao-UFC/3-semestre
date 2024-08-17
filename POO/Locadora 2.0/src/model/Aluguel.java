package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Aluguel {
	private Cliente cliente;
	private Veiculo veiculo;
	private Calendar dataAluguel;
	private Calendar dataDevolucao;
	private double valorTotal;
	
	public Aluguel(){
		super();
	}

	public Aluguel(Cliente cliente, Veiculo veiculo, Calendar dataAluguel, Calendar dataDevolucao, double valorTotal) {
		this();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dataAluguel = dataAluguel;
		this.dataDevolucao = dataDevolucao;
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Calendar getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(Calendar dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux += cliente.toString();
		aux += veiculo.toString();
		aux += "Data do aluguel: "+converter(dataAluguel)+"\n";
		aux += "Data da devolução: "+converter(dataDevolucao)+"\n";
		aux += "Valor do aluguel: "+valorTotal+"\n\n";
		return aux;
	}
	
	private String converter(Calendar data){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(data.getTime());
	}
}
