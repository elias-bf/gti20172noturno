package lista3;
import java.util.Scanner;

public class Exer32{

	public static void main(String[] args) {
		 
		Scanner leia=new Scanner(System.in);
		
		int Cont, Soma=0, n;
        System.out.println("Digite um numero: (maior que 1)");
        n = leia.nextInt();
        Cont = 1;
        while(Cont > n){
            Cont = Cont + 1;
            Soma = Soma + Cont;
        }
        System.out.println(Soma); 
    }
}