package lista2Atividades;
import java.util.Scanner; 
public class algarismos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, num1, num2, num3; 
		
		
		System.out.println("Entre com um n�mero de tr�s algarismos: "); 
		 numero = ler.nextInt();
		 
		 num1 = numero/100;
		 num2 = numero%100/10;
		 num3 = numero%10;
		 System.out.println("O primeiro n�mero �: "+num1);
		 System.out.println("O segundo n�mero �: "+num2);
		 System.out.println("O terceiro n�mero �: "+num3);
	}
}
