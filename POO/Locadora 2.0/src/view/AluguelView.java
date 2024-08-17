package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import controller.AluguelController;
import controller.VeiculoController;
import model.Aluguel;
import model.Cliente;
import model.Veiculo;

public class AluguelView {
	private static AluguelView veiculoView;
	private AluguelController controller = AluguelController.getInstance();
	private VeiculoController controllerVeiculo = VeiculoController.getInstance();
	private Scanner sc;
	
	private AluguelView(){
		super();
	}
	
	public static AluguelView getInstace(){
		if(veiculoView == null)
			veiculoView = new AluguelView();
		return veiculoView;
	}
	
	public String buscarAluguelCarro(String placa) throws Exception{
		return controller.buscarAluguelCarro(placa).toString();
	}
	
	public void alugar(){
		sc = new Scanner(System.in);
		System.out.println("Digite o nome do cliente: ");
		String cliente = sc.nextLine();
		Veiculo veiculo = null;
		try {
			System.out.println("digite a placa do veiculo: ");
			veiculo = controllerVeiculo.buscarPlaca(sc.nextLine());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		Calendar dataAluguel = null;
		try {
			System.out.println("digite a data de aluguel do veiculo: ");
			dataAluguel = converte(sc.nextLine());
		} catch (ParseException e) {
			System.err.println("Data inválida, por favor digite uma data com o seguinte padrão: dd/MM/yyyy");
		}
		Calendar dataDevolucao = null;
		try {
			System.out.println("digite a data de devolução do veiculo: ");
			dataDevolucao = converte(sc.nextLine());
		} catch (ParseException e) {
			System.err.println("Data inválida, por favor digite uma data com o seguinte padrão: dd/MM/yyyy");
		}
		double valorTotal = 0;
		try {
			valorTotal = dias(dataAluguel, dataDevolucao)*veiculo.getValorDiaria();
			controller.alugar(new Aluguel(new Cliente(cliente), veiculo, dataAluguel, dataDevolucao, valorTotal));
			controllerVeiculo.mudarStatusAlugado(veiculo.getPlaca());
			System.out.println("Valor total previsto para esse aluguel: "+valorTotal);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void devolverVeiculo(){
		sc = new Scanner(System.in);
		System.out.println("digite a placa do veiculo: ");
		Aluguel aluguel = null;
		try {
			aluguel = controller.buscarAluguel(sc.nextLine());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		Calendar dataDevolucao = null;
		try {
			System.out.println("digite a data de devolução do veiculo: ");
			dataDevolucao = converte(sc.nextLine());
		} catch (ParseException e) {
			System.err.println("Data inválida, por favor digite uma data com o seguinte padrão: dd/MM/yyyy");
		}
		double valorTotal = 0;
		try{
			valorTotal = dias(aluguel.getDataAluguel(), dataDevolucao)*aluguel.getVeiculo().getValorDiaria();
			aluguel.setDataDevolucao(dataDevolucao);
			aluguel.setValorTotal(valorTotal);
			controller.alterarValorDoAluguel(aluguel);
			controllerVeiculo.mudarStatusDisponivel(aluguel.getVeiculo().getPlaca());
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	private Calendar converte(String data) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(data));
		return cal;
	}
	
	private int dias(Calendar dataInicial, Calendar dataFinal) throws Exception{
		if(dataInicial.before(dataFinal)){
			long diferenca = dataFinal.getTimeInMillis() - dataInicial.getTimeInMillis();
			return (int) ((diferenca /1000) / 60 / 60 /24);
		}else{
			throw new Exception("Data de inicio do aluguel após devolução");
		}
	}
}
