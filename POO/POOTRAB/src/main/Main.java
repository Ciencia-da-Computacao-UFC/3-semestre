package main;

import java.util.Scanner;

import veiculo.Caminhoes;
import veiculo.Motos;
import veiculo.Onibus;
import veiculo.Veiculo;
import veiculo.VeiculoUtilitario;
import veiculo.VeiculosPasseio;

public class Main {
	public static void main(String[] args) {
		boolean k = true;
		while(k == true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Opções:");
		System.out.println(     "1- Cadastrar Carro na Loja \n");
		System.out.println(		"2- Consultar Carro (Placa) \n");
		System.out.println(		"3- Pesquisar Carros (Marca/Modelo/Ano/Valor) \n");
		System.out.println(		"4- Listagem de Carros Disponíveis \n");
		System.out.println(		"5- Listagem de Carros Indisponíveis \n");
		System.out.println(		"6- Informações de Aluguel (Placa) \n");
		System.out.println(		"7- Finalizar \n");
		
		int esc = scan.nextInt();		
		switch (esc) {
		case 1:
			System.out.println("1" + Veiculo.gerarPlaca());
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		case 7:		
				System.exit(0);
				break;
		}
		}
	}	
}
