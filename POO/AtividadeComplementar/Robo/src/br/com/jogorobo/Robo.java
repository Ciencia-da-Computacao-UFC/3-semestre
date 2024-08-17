package br.com.jogorobo;

import java.util.Scanner;

public class Robo {
	private String nome;
	private char simbolo;
	private Coordenadas coordRobo;
	
	
	
	public Robo(String nome, char simbolo) {
		this.nome = nome;
		this.simbolo = simbolo;
		this.coordRobo = new Coordenadas();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public Coordenadas getCoordRobo() {
		return coordRobo;
	}

	public void setCoordRobo(Coordenadas coordRobo) {
		this.coordRobo = coordRobo;
	}
	
	public void comando(char com) {
		if(com == 'd') {			
			this.coordRobo.setCoordX(coordRobo.getCoordX()+1);		
		}
		else if(com == 'a') {
			this.coordRobo.setCoordX(coordRobo.getCoordX()-1);
		}
		else if(com == 's') {
			this.coordRobo.setCoordY(coordRobo.getCoordY()+1);
		}
		else if(com == 'w') {
			this.coordRobo.setCoordY(coordRobo.getCoordY()-1);
		}
		else {
			System.out.println("VOCÊ TEM DEMENCIA????\n Pfv buscar um especialista...");
		}
	}
	
	public Coordenadas mover() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o comando: ");
		String comando = scan.next();
		comando(comando.charAt(0));
		return coordRobo;
	}
}
