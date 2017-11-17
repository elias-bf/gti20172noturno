package projetoimovel;

import javax.swing.JOptionPane;

/**
 *
 * @author alexandre
 */
public class ProjetoImovel {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int op=-1;    
    int opc=-1;
    int valor;
    
        while(op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n[0] - Voltar \n[1] Imovel novo \n[2] Imovel Velho"));    
            if(op==1){
                Novo im = new Novo();
                while(opc!=0){
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n[0] - Voltar \n[1] - Inserir valor do imóvel \n[2] - Ver preço final")); 
                    if(opc==1){
                        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do imóvel"));
                        im.setValor(opc);
                    } else if(opc==2){
                        JOptionPane.showMessageDialog(null, "Preço final do imóvel novo: " + im.getValor());
                    }
                }
            } else if(op==2){
                Velho im = new Velho();
                while(opc!=0){
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n[0] - Voltar \n[1] - Inserir valor do imóvel \n[2] - Ver preço final")); 
                    if(opc==1){
                        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do imóvel"));
                        im.setValor(opc);
                    } else if(opc==2){
                        JOptionPane.showMessageDialog(null, "Preço final do imóvel velho: " + im.getValor());
                    }
                }
            }
        }   
    }   
}
