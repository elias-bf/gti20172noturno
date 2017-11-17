
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

//    public int getID() {
//        return ID;
//    }
//
//    public void setID(int ID) {
//        this.ID = ID;
//    }
//
//    public String getFabricante() {
//        return fabricante;
//    }
//
//    public void setFabricante(String fabricante) {
//        this.fabricante = fabricante;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }
//
//    public String getCor() {
//        return cor;
//    }
//
//    public void setCor(String cor) {
//        this.cor = cor;
//    }
//
//    public String getPlaca() {
//        return placa;
//    }
//
//    public void setPlaca(String placa) {
//        this.placa = placa;
//    }
//
//    public String getChassi() {
//        return chassi;
//    }
//
//    public void setChassi(String chassi) {
//        this.chassi = chassi;
//    }
//
//    public int getAno() {
//        return ano;
//    }
//
//    public void setAno(int ano) {
//        this.ano = ano;
//    }


    public String ImpAutomovel() {
        return "Identificação: " + ID + "\nFabricante: " + fabricante + "\nModelo: " + modelo + "\nCor: " + cor + "\nPlaca: " + placa + "\nChassi: " + chassi + "\nAno: " + ano+"\n";
    }
}
