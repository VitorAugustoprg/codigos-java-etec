package listaVetores;
import java.util.Scanner;
public class inversaoVetores {

	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		
		int a[],b[],i,j=9;
		
		a = new int[TAM];
		b = new int[TAM];
		
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor de A");
			a[i] = in.nextInt();
			b[j] = a[i];
			j--;
	}		
		System.out.print("]");
		
		// vetor de A
		System.out.print("\n A[] = [");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i] +" ");
		}
			System.out.print("]");
		
		// vetor de B
				
			System.out.print("\n B[] = [");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] +" ");
		}
		System.out.print("]");
		
		in.close();
	}
}