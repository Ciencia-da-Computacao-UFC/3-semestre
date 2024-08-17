package questão03;

public class Data {
	int mes;
	String[] mesVetor = new String[12];
	
	public Data(int mes) {
		this.mes = mes;
	}

	public void switchcase() {
		switch (this.mes) {
		case 1:
			System.out.println("Mês " + this.mes + " é o mês de janeiro");
			break;

		case 2:
			System.out.println("Mês " + this.mes + " é o mês de fevereiro");
			break;

		case 3:
			System.out.println("Mês " + this.mes + " é o mês de março");
			break;

		case 4:
			System.out.println("Mês " + this.mes + " é o mês de abril");
			break;

		case 5:
			System.out.println("Mês " + this.mes + " é o mês de maio");
			break;
		case 6:
			System.out.println("Mês " + this.mes + " é o mês de junho");
			break;
		case 7:
			System.out.println("Mês " + this.mes + " é o mês de julho");
			break;
		case 8:
			System.out.println("Mês " + this.mes + " é o mês de agosto");
			break;
		case 9:
			System.out.println("Mês " + this.mes + " é o mês de setembro");
			break;
		case 10:
			System.out.println("Mês " + this.mes + " é o mês de outubro");
			break;
		case 11:
			System.out.println("Mês " + this.mes + " é o mês de novembro");
			break;
		case 12:
			System.out.println("Mês " + this.mes + " é o mês de dezembro");
			break;
		default:
			System.out.println("Mês inválido!");
		}
		

	}
	
	public void stringVetor() {
		mesVetor[0]= "Mês " + this.mes + " é o mês de janeiro";
		mesVetor[1]= "Mês " + this.mes + " é o mês de fevereiro";
		mesVetor[2]= "Mês " + this.mes + " é o mês de março";
		mesVetor[3]= "Mês " + this.mes + " é o mês de abril";
		mesVetor[4]= "Mês " + this.mes + " é o mês de maio";
		mesVetor[5]= "Mês " + this.mes + " é o mês de junho";
		mesVetor[6]= "Mês " + this.mes + " é o mês de julho";
		mesVetor[7]= "Mês " + this.mes + " é o mês de agosto";
		mesVetor[8]= "Mês " + this.mes + " é o mês de setembro";
		mesVetor[9]= "Mês " + this.mes + " é o mês de outubro";
		mesVetor[10]= "Mês " + this.mes + " é o mês de novembro";
		mesVetor[11]= "Mês " + this.mes + " é o mês de dezembro";
		System.out.println(mesVetor[mes-1]);
		
		
	}
}
