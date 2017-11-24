package lista3;
import java.util.Scanner;

public class Exer35{

	public static void main(String[] args) {
		 
		Scanner leitura=new Scanner(System.in);
		
		float x, soma = 0;
	   	 int cont = 1, fetorial = 1;
	   	 
	   	 System.out.print("Digite o valor de x: ");
	   	 x = leitura.nextInt();
	   	 
	   	 while(cont <= 20){
	   		 soma = soma +(x/fetorial);
	   		 fetorial = cont * fetorial;
	   		 cont++;
	   	 }
	    
	    System.out.println("A soma é: "+soma);
	   	 
	}
	//modificando arquivo para prof. Elias
}

