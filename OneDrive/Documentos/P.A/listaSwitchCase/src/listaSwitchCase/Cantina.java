package listaSwitchCase;
import java.util.Scanner;
public class Cantina {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int c;
	
	System.out.println("Entre com o c�digo: ");
	c =in.nextInt();
	
	switch(c) {
	
	case 1:
		System.out.println("Cachorro quente: R$6,50");
		break;
	case 2:
		System.out.println("CheeseBurger:  8,00");
		break;
	case 3:
		System.out.println("X-Salada: R$9,50");
		break;
	case 4:
		System.out.println("Misto quente: R$7,50");
		break;
	case 5:
		System.out.println("P�o na chapa: R$4,00");
		break;
		default:
			System.out.println("C�digo inv�lido/Produto nao encontrado");
			in.close();
	}
	}
}