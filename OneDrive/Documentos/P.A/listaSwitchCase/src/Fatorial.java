import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,x;
		i=1;
		
		System.out.println("Digite um número para calcular seu fatorial: ");
		x = in.nextInt();
		
		while(i >= x) {
			
			i *=x;
			
			i= i-1;
		}
		in.close();
		System.out.println(x);
	}
}
