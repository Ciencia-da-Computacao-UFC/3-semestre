package view;

import java.util.Random;
import java.util.Scanner;

import controller.VeiculoController;
import model.Caminhao;
import model.Motocicleta;
import model.Onibus;
import model.Passeio;

public class Locadora {
	private static VeiculoView veiculoView = VeiculoView.getInstace();
	private static AluguelView aluguelView = AluguelView.getInstace();
	private static Scanner sc2;

	public static void main(String[] args) {
		povoar();
		exibirMenu();
	}
	
	private static void exibirMenu(){
		sc2 = new Scanner(System.in);
		char op;
		System.out.println("1 - Cadastrar carro na loja");
		System.out.println("2 - Consultar carro (placa)");
		System.out.println("3 - Pesquisar carros (marca/modelo/ano/valor");
		System.out.println("4 - Locar carro");
		System.out.println("5 - Devolver carro");
		System.out.println("6 - Listagem de carros disponíveis");
		System.out.println("7 - Listagem de carros indisponiveis");
		System.out.println("8 - Informações de aluguel (placa)");
		System.out.println("9 - Finalizar");
		op = sc2.nextLine().charAt(0);
		
		switch (op) {
		case '1':
			try {
				veiculoView.exibirMenuCadastrar();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}finally {
				exibirMenu();
			}
			break;
		case '2':
			try {
				System.out.println("Digite o número da placa: ");
				System.out.println(veiculoView.consultarCarroPlaca(sc2.nextLine()));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}finally {
				exibirMenu();
			}
			break;
		case '3':
			try {
				System.out.println(veiculoView.exibirMenuPesquisarCarro());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}finally {
				exibirMenu();
			}
			break;
		case '4':
			try {
				aluguelView.alugar();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}finally {
				exibirMenu();
			}
			break;
		case '5':
			try {
				aluguelView.devolverVeiculo();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}finally {
				exibirMenu();
			}
			break;
		case '6':
			try {
				System.out.println(veiculoView.exibirVeiculosDisponiveis());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}finally {
				exibirMenu();
			}
			break;
		case '7':
			try {
				System.out.println(veiculoView.exibirVeiculosIndisponiveis());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}finally {
				exibirMenu();
			}
			break;
		case '8':
			try {
				System.out.println("Digite o numero da placa: ");
				System.out.println(aluguelView.buscarAluguelCarro(sc2.nextLine()));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}finally {
				exibirMenu();
			}
			break;
		case '9':
			System.exit(0);
			break;
		default:
			System.err.println("Opção invalida");
			exibirMenu();
		}
	}
	
	private static void povoar(){
		VeiculoController controller = VeiculoController.getInstance();
		for(int i=0; i<10; i++){
			try {
				controller.cadastrar(new Passeio(gerarPlaca(), "Branco", "modelo"+i, "fabricante"+i, (2009+i), (10.00+i), 0, i, (i%2 == 0), (i%2 != 0)));
			} catch (Exception e) {
				i--;
			}
		}for(int i=0; i<7; i++){
			try {
				controller.cadastrar(new Motocicleta(gerarPlaca(), "Preto", "modelo"+i, "fabricante"+i, (2009+i), (10.00+i), 0, (70+i)+"HP", (i%2 == 0) ? 0 : 1));
			} catch (Exception e) {
				i--;
			}
		}for(int i=0; i<5; i++){
			try {
				controller.cadastrar(new Onibus(gerarPlaca(), "Cinza", "modelo"+i, "fabricante"+i, (2009+i), (10.00+i), 0, (40+i), (i>4) ? 4 : i));
			} catch (Exception e) {
				i--;
			}
		}
		for(int i=0; i<5; i++){
			try {
				controller.cadastrar(new Caminhao(gerarPlaca(), "Branco", "modelo"+i, "fabricante"+i, (2009+i), (10.00+i), 0, (4000.00+(i*10)), (i>4) ? 4 : i, (100+i)+"HP"));
			} catch (Exception e) {
				i--;
			}
		}
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
