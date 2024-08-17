package br.com.jogorobo;

public class Cenario {
	private Robo[][] cenarioP;
	private Coordenadas roboP;
	public Cenario(int tam) {
		this.cenarioP = new Robo[tam][tam];
		roboP = new Coordenadas();
	}
	
	public void printCenario() {
		for(int i = 0; i < cenarioP.length; i++) {
			for(int j = 0; j < cenarioP.length; j++) {
				if(cenarioP[i][j] == null)
					System.out.print("* ");
				else
					System.out.print(cenarioP[i][j].getSimbolo()+" ");
			}
			System.out.println();
		}
	}
	
	public void addRobo(Robo r1) {
		cenarioP[r1.getCoordRobo().getCoordY()][r1.getCoordRobo().getCoordX()] = r1;
		roboP.setCoordX(r1.getCoordRobo().getCoordX());
		roboP.setCoordY(r1.getCoordRobo().getCoordY());
	}
	public void moverRobo() {
		Coordenadas novascoordenas = cenarioP[roboP.getCoordY()][roboP.getCoordX()].mover();
		verificar(novascoordenas);
		if(verificar(novascoordenas) == true){
		cenarioP[novascoordenas.getCoordY()][novascoordenas.getCoordX()] = cenarioP[roboP.getCoordY()][roboP.getCoordX()];
		cenarioP[roboP.getCoordY()][roboP.getCoordX()] = null;
		roboP.setCoordX(novascoordenas.getCoordX());
		roboP.setCoordY(novascoordenas.getCoordY());
		}
		else {			
			cenarioP[roboP.getCoordY()][roboP.getCoordX()].getCoordRobo().setCoordX(roboP.getCoordX());
			cenarioP[roboP.getCoordY()][roboP.getCoordX()].getCoordRobo().setCoordY(roboP.getCoordY());
		}
	}
	public boolean verificar(Coordenadas novas) {
		if(novas.getCoordX() < cenarioP.length && novas.getCoordY() < cenarioP.length) {
			if(novas.getCoordX() < 0 || novas.getCoordY() < 0) {
				return false;
			}
			else {
			return true;
			}
		}
		else {
			return false;
		}
	}
	public void jogar() {
		int i = 0;
		addRobo(new Robo("r2d2", '!'));
		printCenario();
		while(i == 0) {
			moverRobo();
			printCenario();
		}
	}
}
