package listaVetores;
import java.util.Scanner;
public class somaVetores {
	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		
		int a[],b[],c[],i;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor de A");
			a[i] = in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor de B");
			b[i] = in.nextInt();
			
			c[i] = a[i]+b[i];
		}
		
		System.out.print("\n C = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
	}

}
