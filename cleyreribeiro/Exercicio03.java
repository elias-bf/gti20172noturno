import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
	
		//final = constante
		final int MAX = 4; //50
		int vet1[] = new int[MAX]; 
		int vet2[] = new int[MAX];

		for (int i = 0; i < MAX; i++) {
			vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º numero: "));
			vet2[i] = vet1[i] * 3;
		}
		
		String dados = "";
		for (int i = 0; i < MAX; i++) {
			dados = dados + vet1[i] + " = " + vet2[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, dados);
		//dados.substring(0, dados.length()-2)  tirar a virgula no final
	}
	
}
