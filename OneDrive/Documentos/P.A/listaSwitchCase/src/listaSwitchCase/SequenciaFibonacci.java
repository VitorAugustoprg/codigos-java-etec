package listaSwitchCase;
import java.util.Scanner;
public class SequenciaFibonacci {
	public static void main(String[] args ) {
		Scanner in = new Scanner(System.in);
		int n, primeiroNumero=1, segundoNumero=1, i=2, proximoNumero;
		
		 System.out.println("Digite o valor de 'n' para calcular a série de Fibonacci: ");
	     n = in.nextInt(); 

	        System.out.println("Série de Fibonacci com os primeiros " + n + " termos:");

	        if (n >= 1) {
	            System.out.print(primeiroNumero);
	        }
	        if (n >= 2) {
	            System.out.print(", " + segundoNumero);
	        }

	        
	        while (i < n) {
	            proximoNumero = primeiroNumero + segundoNumero;
	            System.out.print( " , " + proximoNumero);
	            primeiroNumero = segundoNumero;
	            segundoNumero = proximoNumero;
	            i++;
	            
	            in.close();
	        }
	        System.out.println();
}		
		
	}

