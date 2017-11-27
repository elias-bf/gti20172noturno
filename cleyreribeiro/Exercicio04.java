import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
	
		//final = constante
		final int MAX = 4; //50
		String nome[] = new String[MAX]; 
		int tempo[] = new int[MAX];

		for (int i = 0; i < MAX; i++) {
			nome [i] = JOptionPane.showInputDialog("Digite o nome do(a) " + (i+1) + "º professor: ");
			tempo[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de profissão do(a) " + nome[i] + ": "));
		}
		
		String dados = "";
		for (int i = 0; i < MAX; i++) {
			dados = dados + nome[i] + " = " + tempo[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, dados);
		//dados.substring(0, dados.length()-2)  tirar a virgula no final
	}
	
}
