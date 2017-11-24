package lista3;
import java.util.Scanner;

public class Exer33{

	public static void main(String[] args) {
		 
		Scanner leitura=new Scanner(System.in);
		  
		
		int cont= 1;
	      float num,soma=0;
	      while(cont<=20) {
	      System.out.println("Digite um número real: ");
	      num = leitura.nextFloat();
	      soma= num+cont;
	      System.out.println(num + ",");
	      cont++;
	    }
	System.out.println("Soma das 20 séries: " + soma);

	}
	 //mudando arquivo para professor elias

	} 
