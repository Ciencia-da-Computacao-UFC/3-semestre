
package questao04;

import java.util.Scanner;


public class Questao04 {

    
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.incializa(5, 4);
        
        int acao = 0;
        Scanner scan = new Scanner(System.in);
        
        while (true) {            
            System.out.println("1 = adicionar pessoas\n 2 = Retirar pessoas\n 3 = Subir\n 4 = descer\n 5 = encerrar\n");
            
            acao = scan.nextInt();
             
            
            switch(acao){
                case 1: 
                    elevador.entra();
                    break;
                case 2:
                    elevador.sai();
                    break;
                case 3:
                    elevador.sobe();
                    break;
                case 4:
                    elevador.desce();
                    break;
                case 5:
                    System.exit(0);
                    break;
                
                
            }
        }
        
        
        
    }
    
}
