package br.com.ufc.jogos.forca;

 /*
  * Autor: Joao Victor Castelo Martins
  * Classe Conteudo diz respeito as palavras
  * que devem ser adivinhadas no jogo.
  */
public class Conteudo {
	private String dica; // Dica fundamental
	private String palavra; // palavra que se deve adivinhar

	//Construtor
	public Conteudo(String dica, String palavra){
		this.dica = dica;
		this.palavra = palavra;
	}
	
	//Metodos getters e setters
	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

}
