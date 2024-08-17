package br.com.jogorobo;

import java.util.Scanner;

public class JogoRobo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz: \n");
		int rec = scan.nextInt();
		Cenario c1 = new Cenario(rec);
		
	
	/*Robo r1 = new Robo("r2d2", '!');
	c1.addRobo(r1);
	c1.printCenario();
	c1.moverRobo();
	c1.printCenario();*/
	
	c1.jogar();
}
}
