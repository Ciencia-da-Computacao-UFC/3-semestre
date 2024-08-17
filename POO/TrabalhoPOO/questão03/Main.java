package questão03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int mes = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um mês: ");
		mes = scanner.nextInt();
		Data data = new Data(mes);
		data.switchcase();
		data.stringVetor();
	}
}
