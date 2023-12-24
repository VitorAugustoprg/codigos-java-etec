package listaSwitchCase;
import java.util.Scanner;
public class Expoente {
	public static void main(String[] args ) {
		Scanner in = new Scanner(System.in);
		int b,e,i=1;
		
		System.out.println("Digite a base: ");
		b = in.nextInt();
		
		System.out.println("Digite o expoente: ");
		e = in.nextInt();
		
		while(i < e) {
			b *= b;
			
			
			System.out.println("O valor da potência é: "+b);
			i++;
		}
		
		
		in.close();
	}
}
