package principal;

import corpodiscente.Estudante;
import corpodiscente.EstudanteTutor;

public class Faculdade {

	public static void matricularEstudante(Estudante e) {
		System.out.println(e.getNome()+" esta matriculado");
	}
	
	public static void reprovar(Estudante e) {
		System.out.println("Estudante"+ e.getNome()+"reprovado");
		
	}
	public static void main(String[] args) {
		//EstudanteTutor et = new EstudanteTutor("Joao", 1, 'M', 3, "POO", 400);
		//System.out.println(et.nome);
	
		//Estudante e = new EstudanteTutor("Joao", 1, 'M', 3, "POO", 400);
		//EstudanteTutor e = new EstudanteTutor("Joao", 1, 'M', 3, "POO", 400);
		//matricularEstudante(e);
		
	}

}
