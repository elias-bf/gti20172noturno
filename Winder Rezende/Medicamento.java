package POOExercicio4;

public class Medicamento {
   
    private int ID;
    private String Nome;
    private String principioAtivo;
    private String und;
    private int qtdeEstoque;
    private String dataValidade;
    
    public Medicamento(){
    
    }
    
    public Medicamento(int ID, String Nome, String principioAtivo, String und, int qtdeEstoque, String dataValidade){
        this.ID = ID;
        this.Nome = Nome;
        this.principioAtivo = principioAtivo;
        this.und = und;
        this.qtdeEstoque = qtdeEstoque;
        this.dataValidade = dataValidade;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public String getUnd() {
        return und;
    }

    public void setUnd(String und) {
        this.und = und;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
   
   
    public String Imprimir() {
        return "Medicamento:\n" + "ID: " + ID + "\nNome: " + Nome + "\nPrincipio Ativo: " + principioAtivo + "\nUnidade: " + und + "\nQuantidade em Estoque: " + qtdeEstoque + "\nData de Validade: " + dataValidade+"\n";
    }
}
