package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import controller.VeiculoController;
import model.Caminhao;
import model.Motocicleta;
import model.Onibus;
import model.Passeio;
import model.Utilitario;
import model.Veiculo;

public class VeiculoView {
	private static VeiculoView veiculoView;
	private VeiculoController controller = VeiculoController.getInstance();
	private Scanner sc;
	private Scanner sc2;
	
	private VeiculoView(){
		super();
	}
	
	public static VeiculoView getInstace(){
		if(veiculoView == null)
			veiculoView = new VeiculoView();
		return veiculoView;
	}
	
	public String consultarCarroPlaca(String placa) throws Exception{
		return controller.buscarPlaca(placa).toString();
	}
	
	public String exibirVeiculosDisponiveis() throws Exception{
		List<Veiculo> aux = controller.listarCarrosDisponiveis();
		aux = ordenar(aux);
		String lista = "";
		for(Veiculo veiculo : aux)
			lista += veiculo.toString()+"\n\n";
		return lista;
	}
	
	public String exibirVeiculosIndisponiveis() throws Exception{
		List<Veiculo> aux = controller.listarCarrosIndisponiveis();
		aux = ordenar(aux);
		String lista = "";
		for(Veiculo veiculo : aux)
			lista += veiculo.toString()+"\n\n";
		return lista;
	}
	
	public String exibirMenuPesquisarCarro() throws Exception{
		sc2 = new Scanner(System.in);
		sc = new Scanner(System.in);
		char op;
		System.out.println("1 - Marca");
		System.out.println("2 - Modelo");
		System.out.println("3 - Ano");
		System.out.println("4 - Valor");
		op = sc.nextLine().charAt(0);
		switch (op) {
		case '1':
			System.out.println("Digite o nome da marca: ");
			return controller.buscarMarca(sc.nextLine()).toString();
		case '2':
			System.out.println("Digite o nome do modelo: ");
			return controller.buscarModelo(sc.nextLine()).toString();
		case '3':
			System.out.println("Digite o Ano: ");
			return controller.buscarAno(sc2.nextInt()).toString();
		case '4':
			System.out.println("Digite o valor: ");
			return controller.buscarValor(sc2.nextDouble()).toString();
		default:
			System.err.println("Opção inválida");
			exibirMenuPesquisarCarro();
		}
		throw new Exception("Opção inválida");
	}
	
	public void exibirMenuCadastrar() throws Exception{
		sc = new Scanner(System.in);
		char op;
		System.out.println("1 - Veiculo de passeio");
		System.out.println("2 - Veiculo utilitario");
		System.out.println("3 - Motocicleta");
		System.out.println("4 - Onibus");
		System.out.println("5 - Caminhão");
		op = sc.nextLine().charAt(0);
		switch (op) {
		case '1':
			cadastrarPasseio();
			break;
		case '2':
			cadastrarUtilitario();
			break;
		case '3':
			cadastrarMotocicleta();
			break;
		case '4':
			cadastrarOnibus();
			break;
		case '5':
			cadastrarCaminhao();
			break;
		default:
			System.err.println("Opção inválida");
			exibirMenuCadastrar();
		}
	}
	
	private void cadastrarPasseio() throws Exception{
		sc = new Scanner(System.in);
		sc2 = new Scanner(System.in);
		String op;
		//String placa = sc.nextLine();
		String placa = gerarPlaca();
		System.out.println("Cor: ");
		String cor = sc.nextLine();
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Fabricante: ");
		String fabricante = sc.nextLine();
		System.out.println("Ano de fabricão: ");
		int anoFabricacao = sc2.nextInt();
		System.out.println("Valor da diária: ");
		double valorDiaria = sc2.nextDouble();
		int situacao = 0;
		System.out.println("Número de portas: ");
		int numeroPortas = sc2.nextInt();
		System.out.println("Tem ar-condionado? [S] [N]");
		op = sc.nextLine();
		boolean arCondicionado = (op.equals("S") || op.equals("s")) ? true : false;
		System.out.println("Tem direção hidráulica? [S] [N]");
		op = sc.nextLine();
		boolean direcaoHidraulica = (op.equals("S") || op.equals("s")) ? true : false;
		controller.cadastrar(new Passeio(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao, numeroPortas, arCondicionado, direcaoHidraulica));
	}

	private void cadastrarUtilitario() throws Exception{
		sc = new Scanner(System.in);
		sc2 = new Scanner(System.in);
		String op;
		System.out.println("Placa: ");
		//String placa = sc.nextLine();
		String placa = gerarPlaca();
		System.out.println("Cor: ");
		String cor = sc.nextLine();
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Fabricante: ");
		String fabricante = sc.nextLine();
		System.out.println("Ano de fabricação: ");
		int anoFabricacao = sc2.nextInt();
		System.out.println("Valor da diaria: ");
		double valorDiaria = sc2.nextDouble();
		int situacao = 0;
		System.out.println("tipo de tracao: ");
		String tipoTracao = sc.nextLine();
		System.out.println("Tem teto solar? [S] [N]");
		op = sc.nextLine();
		boolean tetoSolar = (op.equals("S") || op.equals("s")) ? true : false;
		System.out.println("Diametro do aro: ");
		double diametroAro = sc2.nextDouble();
		System.out.println("Tipo do carro: [Urbano] [Off-Road]");
		op = sc.nextLine();
		int tipo = (op.equals("Urbano") || op.equals("urbano")) ? 0 : 1;
		controller.cadastrar(new Utilitario(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao, tipoTracao, tetoSolar, diametroAro, tipo));
	}

	private void cadastrarMotocicleta() throws Exception{
		sc = new Scanner(System.in);
		sc2 = new Scanner(System.in);
		String op;
		System.out.println("Placa: ");
		String placa = gerarPlaca();
		System.out.println("Cor: ");
		String cor = sc.nextLine();
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Fabricante: ");
		String fabricante = sc.nextLine();
		System.out.println("Ano de fabricaçãoo: ");
		int anoFabricacao = sc2.nextInt();
		System.out.println("Valor da diaria: ");
		double valorDiaria = sc2.nextDouble();
		int situacao = 0;
		System.out.println("Potencia: ");
		String potencia = sc.nextLine();
		System.out.println("Tipo da moto: [Urbano] [Off-Road] [Esportiva]");
		op = sc.nextLine();
		int tipo = (op.equals("Urbano") || op.equals("urbano")) ? 0 : ((op.equals("Off-Road") || op.equals("off-road")) ? 1 : 0);
		controller.cadastrar(new Motocicleta(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao, potencia, tipo));
	}

	private void cadastrarOnibus() throws Exception{
		sc = new Scanner(System.in);
		sc2 = new Scanner(System.in);
		System.out.println("Placa: ");
		//String placa = sc.nextLine();
		String placa = gerarPlaca();
		System.out.println("Cor: ");
		String cor = sc.nextLine();
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Fabricante: ");
		String fabricante = sc.nextLine();
		System.out.println("Ano de fabricacaoo: ");
		int anoFabricacao = sc2.nextInt();
		System.out.println("Valor da diaria: ");
		double valorDiaria = sc2.nextDouble();
		int situacao = 0;
		System.out.println("Numero de passageiros: ");
		int numeroPassageiros = sc2.nextInt();
		System.out.println("Numero de eixos");
		int numeroEixos = sc2.nextInt();
		controller.cadastrar(new Onibus(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao, numeroPassageiros, numeroEixos));
	}

	private void cadastrarCaminhao() throws Exception{
		sc = new Scanner(System.in);
		sc2 = new Scanner(System.in);
		System.out.println("Placa: ");
		//String placa = sc.nextLine();
		String placa = gerarPlaca();
		System.out.println("Cor: ");
		String cor = sc.nextLine();
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Fabricante: ");
		String fabricante = sc.nextLine();
		System.out.println("Ano de fabricaçãoo: ");
		int anoFabricacao = sc2.nextInt();
		System.out.println("Valor da diaria: ");
		double valorDiaria = sc2.nextDouble();
		int situacao = 0;
		System.out.println("Capacidade de Carga: ");
		double capacidadeCarga = sc2.nextDouble();
		System.out.println("Numero de eixos: ");
		int numeroEixos = sc2.nextInt();
		System.out.println("Potencia: ");
		String potencia = sc.nextLine();
		controller.cadastrar(new Caminhao(placa, cor, modelo, fabricante, anoFabricacao, valorDiaria, situacao, capacidadeCarga, numeroEixos, potencia));
	}
	
	private List<Veiculo> ordenar(final List<Veiculo> vei){
		List<Veiculo> aux = new ArrayList<>();
		vei.forEach((mot) -> {
			if(mot instanceof Motocicleta)
				aux.add(mot);
		});
		vei.forEach((mot) -> {
			if(mot instanceof Passeio)
				aux.add(mot);
		});
		vei.forEach((mot) -> {
			if(mot instanceof Utilitario)
				aux.add(mot);
		});
		vei.forEach((mot) -> {
			if(mot instanceof Onibus)
				aux.add(mot);
		});
		vei.forEach((mot) -> {
			if(mot instanceof Caminhao)
				aux.add(mot);
		});
		return aux;
	}
	
	private static String gerarPlaca(){
		Random rd = new Random();
		char numeros[] = new char[4];
		char letra[] = new char[3];
		for(int i=0; i<3; i++){
			letra[i] = (char) (rd.nextInt(26)+65);
		}
		for(int i=0; i<4; i++){
			numeros[i] += (char) rd.nextInt(9)+48;
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(letra);
		stringBuilder.append("-");
		stringBuilder.append(numeros);
		return stringBuilder.toString();
	}
}
