package quest�o03;

public class Data {
	int mes;
	String[] mesVetor = new String[12];
	
	public Data(int mes) {
		this.mes = mes;
	}

	public void switchcase() {
		switch (this.mes) {
		case 1:
			System.out.println("M�s " + this.mes + " � o m�s de janeiro");
			break;

		case 2:
			System.out.println("M�s " + this.mes + " � o m�s de fevereiro");
			break;

		case 3:
			System.out.println("M�s " + this.mes + " � o m�s de mar�o");
			break;

		case 4:
			System.out.println("M�s " + this.mes + " � o m�s de abril");
			break;

		case 5:
			System.out.println("M�s " + this.mes + " � o m�s de maio");
			break;
		case 6:
			System.out.println("M�s " + this.mes + " � o m�s de junho");
			break;
		case 7:
			System.out.println("M�s " + this.mes + " � o m�s de julho");
			break;
		case 8:
			System.out.println("M�s " + this.mes + " � o m�s de agosto");
			break;
		case 9:
			System.out.println("M�s " + this.mes + " � o m�s de setembro");
			break;
		case 10:
			System.out.println("M�s " + this.mes + " � o m�s de outubro");
			break;
		case 11:
			System.out.println("M�s " + this.mes + " � o m�s de novembro");
			break;
		case 12:
			System.out.println("M�s " + this.mes + " � o m�s de dezembro");
			break;
		default:
			System.out.println("M�s inv�lido!");
		}
		

	}
	
	public void stringVetor() {
		mesVetor[0]= "M�s " + this.mes + " � o m�s de janeiro";
		mesVetor[1]= "M�s " + this.mes + " � o m�s de fevereiro";
		mesVetor[2]= "M�s " + this.mes + " � o m�s de mar�o";
		mesVetor[3]= "M�s " + this.mes + " � o m�s de abril";
		mesVetor[4]= "M�s " + this.mes + " � o m�s de maio";
		mesVetor[5]= "M�s " + this.mes + " � o m�s de junho";
		mesVetor[6]= "M�s " + this.mes + " � o m�s de julho";
		mesVetor[7]= "M�s " + this.mes + " � o m�s de agosto";
		mesVetor[8]= "M�s " + this.mes + " � o m�s de setembro";
		mesVetor[9]= "M�s " + this.mes + " � o m�s de outubro";
		mesVetor[10]= "M�s " + this.mes + " � o m�s de novembro";
		mesVetor[11]= "M�s " + this.mes + " � o m�s de dezembro";
		System.out.println(mesVetor[mes-1]);
		
		
	}
}
