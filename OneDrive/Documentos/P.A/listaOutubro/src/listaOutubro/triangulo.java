package listaOutubro;
import java.util.Scanner; 
public class triangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = in.nextInt(); 
		
		System.out.println("Digite o valor de B: ");
		b = in.nextInt(); 
		
		System.out.println("Digite o valor de C: ");
		c = in.nextInt();
		
		if((a + b  > c) && (a + c > b) && (b + c > a)){
			System.out.println("� um tri�ngulo v�lido");
			}else {
				System.out.println("n�o � um tri�ngulo v�lido");
		}	
		if(a == b && b == c){
				System.out.println("Tri�ngulo equil�tero");
		}		else if(a != b && b != c) {
					System.out.println("tri�ngulo escaleno");
		}			else{
						System.out.println("Tri�ngulo is�sceles");
		}
	}
}
