import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Cadeira cadeirinha = new Cadeira();
		
		cadeirinha.setAltura(1.74f);
		cadeirinha.setLargura(1.50f);
		cadeirinha.setCor("Rosa");
		cadeirinha.setMaterial("Madeira");
		
		JOptionPane.showMessageDialog(null, cadeirinha.retorno());
		JOptionPane.showMessageDialog(null, "CADEIRINHA v2\n Altura: " +cadeirinha.getAltura() +"\nLargura: " +cadeirinha.getLargura() +"\nCor: " +cadeirinha.getCor() +"\nMaterial: " +cadeirinha.getMaterial());
		
		Sala salinha = new Sala();
		
		salinha.setNumCadeiras(10);
		salinha.setNumMesas(5); 
		salinha.setAndar(4);
		salinha.setTamanho(2.44f);
		
		JOptionPane.showMessageDialog(null, salinha.retorno());
		JOptionPane.showMessageDialog(null, "SALINHA v2\n Número de cadeiras: " +salinha.getNumCadeiras() +"\nNúmero de mesas: " +salinha.getNumMesas() +"\nAndar: " +salinha.getAndar() +"\nTamanho: " +salinha.getTamanho());
		
		Computador pczinho = new Computador();
		
		pczinho.setHd(4.44f);
		pczinho.setMemoria(1.37f);
		pczinho.setPreco(2.200f);
		pczinho.setProcessador("Foda");
		
		JOptionPane.showMessageDialog(null, pczinho.retorno());
		JOptionPane.showMessageDialog(null, "PCZINHO v2 \n Processador: " +pczinho.getProcessador() +"\nMemória: " +pczinho.getMemoria() +"\nHD: " +pczinho.getHd() +"\nPreço: " +pczinho.getPreco());
		
		
	}

}
