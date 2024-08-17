package br.com.ufc.jogos.forca;

/*
 * Autor: Joao Victor Castelo Martins
 * Classe forca possui todos os metodos 
 * necessarios para o jogo funcionar.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Forca {
	int cont;
	private int vidas; // Quantidade de tentativas
	private String letras_usadas; //Letras que ja foram chutadas
	private ArrayList<Conteudo> palavras_adv; // lista de conteudo 
	private Conteudo selecionado; // palavra selecionada
	private String adv; // String auxiliar
	//Construtor 
	public Forca() {
		this.vidas = 5;
		this.letras_usadas = "";
		this.palavras_adv = new ArrayList<>();
		this.adv = "";
		criarListaPalavras();
	}
	
	//Cria a lista de conteudos
	private void criarListaPalavras() {
		//Cria os conteudos
		Conteudo c1 = new Conteudo("Filme", "Matrix");
		Conteudo c2 = new Conteudo("Filme", "Titanic");
		Conteudo c3 = new Conteudo("Filme", "Vingadores");
		Conteudo c4 = new Conteudo("Filme", "Batman");
		Conteudo c5 = new Conteudo("Filme", "Smurfs");
		Conteudo c6 = new Conteudo("Animal", "Calango");
		Conteudo c7 = new Conteudo("Animal", "Briba");
		Conteudo c8 = new Conteudo("Animal", "Gia");
		Conteudo c9 = new Conteudo("Animal", "Cururu");
		Conteudo c10 = new Conteudo("Animal", "Grauna");
		
		//Adiciona na lista
		palavras_adv.add(c10);
		palavras_adv.add(c9);
		palavras_adv.add(c8);
		palavras_adv.add(c7);
		palavras_adv.add(c6);
		palavras_adv.add(c5);
		palavras_adv.add(c4);
		palavras_adv.add(c3);
		palavras_adv.add(c2);
		palavras_adv.add(c1);
	}
	
	//Printa na tela as palavras que ja foram 
	//chutadas
	private void printarPalavrasUsadas() {
		System.out.println("Palavras ja utilizadas");
		for(int i = 0; i < letras_usadas.length();i++) {
			System.out.print(letras_usadas.charAt(i)+" ");
		}
		System.out.println();
	}
	
	/*
	 * Printa a palavra a ser adivinhada
	 * A palavra e printada de maneira oculta
	 * Ex: _ _ _ _ _ _ 
	 */
	private void printarPalavraAdv() {
		for(int i = 0; i< adv.length();i++) {
			System.out.print(adv.charAt(i)+" ");
		}
	}
	
	/*
	 * Seleciona um conteudo aleatorio.
	 */
	public void selecionaConteudo() {
		Random r = new Random();
		selecionado = palavras_adv.get(r.nextInt(palavras_adv.size()));
		for(int i =0; i < selecionado.getPalavra().length();i++) {
			adv = adv+"_"; // String auxiliar eh criptografada
		}
	}
	
	/*
	 * Recebe como parametro uma letra 
	 * escolhida pelo usuario, caso a palavra
	 * possua a letra, esta sera revelada
	 */
	private void chutarLetra(char letra) {
		boolean acertou = false;
		char[] adv_n;
		adv_n = adv.toCharArray(); // Transforma a string em um array de char.
		adv = ""; // String auxiliar vazia.
		
		char aux1 = Character.toLowerCase(letra);
		char aux2 = Character.toUpperCase(letra);
		
		for(int i = 0; i < selecionado.getPalavra().length();i++) {
			
			if(selecionado.getPalavra().charAt(i) == aux1 || selecionado.getPalavra().charAt(i) == aux2 ) {// Revela a letra
				adv_n[i] = selecionado.getPalavra().charAt(i);
				acertou = true;
				if(acertou == true) {
					cont++;
				}
			}
			adv = adv+adv_n[i];
			
		}
		if(acertou == false) {
			vidas = vidas -1;
			letras_usadas = letras_usadas+letra; // Adiciona a letra nas letras chutadas
			if(vidas <= 0) {
				System.out.println("Você perdeu!");
				System.exit(0);
			}
		}	
	}
	
	/*
	 * Faz todas as acoes do jogo da forca
	 */
	public void jogar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Numero de vidas: "+ vidas);
		System.out.println("Dica: "+selecionado.getDica());
		System.out.print("Palavra: ");
		printarPalavraAdv();
		System.out.println("Letras Usadas: ");
		printarPalavrasUsadas();
		System.out.println("Chute uma letra: ");
		String letra = scan.next();
		chutarLetra(letra.charAt(0));
		scan.reset();
		if(cont == selecionado.getPalavra().length()) {
			System.out.println("------------------");
			printarPalavraAdv();
			System.out.println("\n");
			System.out.println("\n Você ganhou!!");
			System.out.println("------------------");
			System.exit(0);
		}
	}
}
