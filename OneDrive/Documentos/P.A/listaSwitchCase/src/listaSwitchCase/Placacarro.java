package listaSwitchCase;
import java.util.Scanner;
public class Placacarro {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int p;
	
	System.out.println("Digite o �ltimo n�mero da placa de seu ve�culo: ");
	p = in.nextInt();
	
	switch(p) {
	case 1:
	case 2:	
		System.out.println("N�o pode circular Segunda-Feira");
		break;
	case 3:
	case 4:	
		System.out.println("N�o pode circular Ter�a-Feira");
		break;
	case 5:
	case 6:	
		System.out.println("N�o pode circular Quarta-Feira");
		break;
	case 7:
	case 8:	
		System.out.println("N�o pode circular Quinta-Feira");
		break;
	case 9:
	case 0:	
		System.out.println("N�o pode circular Sexta-Feira");
		break;
	
		
		
	}
	in.close();
	}
}