package projetopessoa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alexandre.almeida
 */
public class ProjetoPessoa {
    static ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
    
    public static void cadastrar(){
        String nome;
        int idade;
        int op;
        
        op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a classe da pessoa \n[1] - Rica \n[2] - Pobre \n[3] - Miserável"));            
        nome = JOptionPane.showInputDialog("Insira o nome da pessoa");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade da pessoa"));
        
        if(op==1){
                Rica rich = new Rica();
                rich.setNome(nome);
                rich.setIdade(idade);
                listaPessoa.add(rich);
        } else if(op==2) {
            Pobre pob = new Pobre();
            pob.setNome(nome);
            pob.setIdade(idade);
            listaPessoa.add(pob);
        } else if(op==3) {
            Miseravel mi = new Miseravel();
            mi.setNome(nome);
            mi.setIdade(idade);
            listaPessoa.add(mi);
        } else {
            JOptionPane.showMessageDialog(null, "Escolha inválida! ","ERRO!",1);
        }
    }
    
    public static void imprimir(){
        String dados = "";
        for(int i=0; i<listaPessoa.size(); i++){
            dados += listaPessoa.get(i).toString();  
        }
        JOptionPane.showMessageDialog(null, dados);
    }
    
    public static int menu(){
        int op;
        String menu = "Escolha uma opção:"
                + "\n[0] - Sair"
                + "\n[1] - Cadastrar"
                + "\n[2] - Imprimir";
        op = Integer.parseInt(JOptionPane.showInputDialog(menu));
        return op;
    }
    
    public static void main(String[] args) {
        int opc=-1;

        while(opc!=0){
            opc = menu();

            if(opc==1){
                cadastrar();
            } else if(opc==2){
              imprimir();
            } 
        }
        
    }
    
        
    
}
