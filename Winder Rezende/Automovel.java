
package POOExercicio4;

public class Automovel {

    private int ID;
    private String fabricante;
    private String modelo;
    private String cor;
    private String placa;
    private String chassi;
    private int ano;

    //Contrutor com agumentos
    public Automovel(int ID, String fabricante, String modelo, String cor, String placa, String chassi, int ano){
        this.ID = ID;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.ano = ano;
    }

   //Contrutor Padrão
   public Automovel(){
       
   }
<<<<<<< HEAD
    
    public void setId(int id){
    	this.id=id;
    }
    public int getId(){
	return this.id;
    }
    
=======
	
    //Teste teste 

>>>>>>> b0fb24158ad421abd8ca53614afa0e9fd4f2f985
    public String ImpAutomovel() {
        return "Identificação: " + ID + "\nFabricante: " + fabricante + "\nModelo: " + modelo + "\nCor: " + cor + "\nPlaca: " + placa + "\nChassi: " + chassi + "\nAno: " + ano+"\n";
    }
}
