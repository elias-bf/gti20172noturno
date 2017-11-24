package lista3;
import java.util.Scanner;
 
public class Exer48 {
 
    private static Scanner leitura;
    
    public static void main(String[] args) {
    
    	Scanner leitura = new Scanner(System.in);
    
    	int num,  impar=0, somapar=0, pi=0, maior=0;
    	float par=0;
        System.out.println("Digite um número: ");
        num = leitura.nextInt();
        
        while(num != 0)
        {
            if(num > maior)
            {
                maior = num;
            }
            if(num%2 == 0)
            {
                
                somapar = somapar + num;
                par++;
            }else
            {
                
                pi = pi + num;
                impar++;
            }
            System.out.println("Digite o próximo número ou '0' para sair: ");
            num = leitura.nextInt();
        }
        System.out.println("Produto dos pares: "+ somapar);
        System.out.println("Produto dos Impares: "+pi);
        System.out.println("O Maior termo: "+ maior);
    }
}
