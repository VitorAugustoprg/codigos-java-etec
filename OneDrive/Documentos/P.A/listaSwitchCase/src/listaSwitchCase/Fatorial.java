package listaSwitchCase;
import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1, f=1,n;
		
		System.out.println("Digite um número do tipo inteiro: ");
		n = in.nextInt();
		
		while(i <= n) {
			f *= i;
			i++;
		}
		System.out.println("O fatorial de "+n+" é: "+f);
		in.close();
	}
	
}
