package listaVetores;
import java.util.Scanner;
	public class mediaVetor {
	public static void main(String[] args) {
		
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		
		int a[],b[],i,media,soma;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor de A");
			a[i] = in.nextInt();
			
			soma = a[i] += i;
	
		}
				
		for(i=0; i<TAM; i++) {
			System.out.println(b[i]+ " ");
		}
		
		
	in.close();
}
}
