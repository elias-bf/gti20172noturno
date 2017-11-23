
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

    
    public void setId(int id){
    	this.id=id;
    }
    public int getId(){
	return this.id;
    }
    
<<<<<<< HEAD
	
    //Teste teste 

=======
    public void setFabricante(String fabricante){
	this.fabricante=fabricante;
    }
    public String getFabricante(){
	return this.fabricante;
    }
	
	
    //Teste teste 


>>>>>>> 8b9538ddba88bb4824cf111fef575b5688aa82fd
    public String ImpAutomovel() {
        return "Identificação: " + ID + "\nFabricante: " + fabricante + "\nModelo: " + modelo + "\nCor: " + cor + "\nPlaca: " + placa + "\nChassi: " + chassi + "\nAno: " + ano+"\n";
    }
}
