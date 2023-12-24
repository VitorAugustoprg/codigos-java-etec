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
			System.out.println("é um triângulo válido");
			}else {
				System.out.println("não é um triângulo válido");
		}	
		if(a == b && b == c){
				System.out.println("Triângulo equilátero");
		}		else if(a != b && b != c) {
					System.out.println("triângulo escaleno");
		}			else{
						System.out.println("Triângulo isósceles");
		}
	}
}
