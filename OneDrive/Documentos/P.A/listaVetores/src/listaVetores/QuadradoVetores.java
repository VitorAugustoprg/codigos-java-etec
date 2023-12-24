package listaVetores;
import java.util.Scanner;
public class QuadradoVetores {

		public static void main(String[] args) {
			final int TAM = 10;
			Scanner in = new Scanner(System.in);
			int a[],b[],c[],i;
			
			a = new int[TAM];
			b = new int[TAM];
			
			for(i=0;i<TAM;i++) {
				System.out.println("Entre com o "+(i+1)+"o. valor de A");
				a[i] = in.nextInt();
			}
			
			System.out.print("\n b[] = [");
			for(i=0;i<TAM;i++) {
				b[i] = a[i]*a[i];
				System.out.print(b[i]+" ");
				
			}
			System.out.print("]");
		}
}
