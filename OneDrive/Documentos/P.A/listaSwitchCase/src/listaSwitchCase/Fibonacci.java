package listaSwitchCase;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i=3,fibonacci,n1=1,n2 = 1;
		
		System.out.println("Digite o enésimo número: ");
		n = in.nextInt();
		
		if(n <= 0) {
			System.out.println("Por favor, insira um valor maior que zero.");
			
		}else {
			System.out.println("A série de "+n+" é:");
			
			if(n >= 1) {
				System.out.println(n1 + " ");
			}
			if(n >= 2) {
				System.out.println(n2 + " ");
			}
			while(i <= n) {
				fibonacci = n1+n2;
				System.out.println(fibonacci + " ");
				
				n1 = n2;
				n2 = fibonacci; 
				
				i++;
			}
		}
		
		
		in.close();	
		
	}
	
}
