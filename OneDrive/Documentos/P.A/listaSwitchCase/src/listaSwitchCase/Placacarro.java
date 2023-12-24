package listaSwitchCase;
import java.util.Scanner;
public class Placacarro {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int p;
	
	System.out.println("Digite o último número da placa de seu veículo: ");
	p = in.nextInt();
	
	switch(p) {
	case 1:
	case 2:	
		System.out.println("Não pode circular Segunda-Feira");
		break;
	case 3:
	case 4:	
		System.out.println("Não pode circular Terça-Feira");
		break;
	case 5:
	case 6:	
		System.out.println("Não pode circular Quarta-Feira");
		break;
	case 7:
	case 8:	
		System.out.println("Não pode circular Quinta-Feira");
		break;
	case 9:
	case 0:	
		System.out.println("Não pode circular Sexta-Feira");
		break;
	
		
		
	}
	in.close();
	}
}