
package questao04;


public class Elevador {
  private int andar;
  private int totalAndares;
  private int capacidade;
  private int numPessoas;

 
    public int getAndar() {
        return andar;
    }

  
    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }


    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


    public int getNumPessoas() {
        return numPessoas;
    }

  
    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }
    
    
    
    public void incializa(int totalAndares, int capacidade){
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;   
    }
    
    public void entra(){
        if(numPessoas < capacidade){
            numPessoas ++;
            System.out.println("Pessoa Entrou");
        }else{
            System.out.println("LOTADASSO!!!");
        }
            
        
    }
    public void sai(){
        if(numPessoas != 0){
            numPessoas --;
            System.out.println("Pessoa saiu");
    }else{
            System.out.println("Sem gente irmÃo");
        }    
    }
    
    public void sobe(){
        if(andar < totalAndares){
            andar++;
            System.out.println("Subiu!!");
            
        }else{
            System.out.println("NÃo sobe mais!!");
        }
    
    }
    
    public void desce(){
        if(andar > 0){
        andar --;
            System.out.println("Desceu!!");
    }else{
            System.out.println("NÃo desce mais!!");
        }
    }
    
    
    
    
  
  
    
}
