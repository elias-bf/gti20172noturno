
package POOExercicio4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AutomovelMain {
    
    static ArrayList<Automovel> ListaProdutos = new ArrayList<Automovel>();
    
    public static int ImprimirMenu(){
        int Opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Inserir\n 2 - Lista\n 3 - Sair\n Digite a opção:"));
        return Opc;  
    }
    
    public static void InserirAutomovel(){
        int ID = 12356;
        String fabricante = JOptionPane.showInputDialog("Digite o fabricante do Automovel:");
        String modelo = JOptionPane.showInputDialog("Digite o modelo da Automovel:");
        String cor = JOptionPane.showInputDialog("Digite a cor do Automovel:");
        String placa = JOptionPane.showInputDialog("Digite o número da placa do Automovel:");
        String chassi = JOptionPane.showInputDialog("Digite o número do chassi do Automovel:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação:"));
        
        //Agumentos
        Automovel AutoArgum = new Automovel(ID, fabricante, modelo, cor, placa, chassi, ano);
        
        //Padrão
//        Automovel AutoPadrao = new Automovel();
//        AutoPadrao.setID(ID);
//        AutoPadrao.setFabricante(fabricante);
//        AutoPadrao.setModelo(modelo);
//        AutoPadrao.setCor(cor);
//        AutoPadrao.setPlaca(placa);
//        AutoPadrao.setChassi(chassi);
//        AutoPadrao.setAno(ano);
        
        ListaProdutos.add(AutoArgum);
    }
    
    public static void ListarAutomovel(){
        String dados = "";
        for (int i = 0; i < ListaProdutos.size(); i++) {
            Automovel Ls = ListaProdutos.get(i);
            dados += "Automovel:\n"+Ls.ImpAutomovel()+"\n";
        }
        JOptionPane.showMessageDialog(null, dados);
    }
    
    public static void main(String[] args) {
        int Opc;
        
        do{
            Opc = ImprimirMenu();
            if(Opc == 1){
                InserirAutomovel();
            }
            else if(Opc == 2){
                ListarAutomovel();
            }
            else if(Opc <1 || Opc >3){
                JOptionPane.showMessageDialog(null,"OPÇÃO INVALIDA!!! DIGITE NOVAMENTE...");
            }
            else if(Opc == 3){
                JOptionPane.showMessageDialog(null, "Programa Finalizado!!!");
            }
        
        }while(Opc != 3);       
    }   
}
