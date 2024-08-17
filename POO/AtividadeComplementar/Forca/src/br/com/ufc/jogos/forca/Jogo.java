package br.com.ufc.jogos.forca;

public class Jogo {
	public static void main(String[] args) {
		Forca f = new Forca();
		f.selecionaConteudo();
		int i = 0;
		while(i == 0) {
			f.jogar();
		}
	}
}
