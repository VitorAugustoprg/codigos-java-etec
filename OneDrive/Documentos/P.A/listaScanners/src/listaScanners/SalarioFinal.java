package listaScanners;
import java.util.Scanner; 
public class SalarioFinal {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double salarioFinal, salarioInicial, dependentes, acrescimo; 
	
	System.out.println("Digite o sal�rio: "); 
	salarioInicial = ler.nextDouble(); 
	
	System.out.println("Digite o n�mero de dependentes: "); 
	dependentes = ler.nextDouble();
	
	acrescimo = dependentes*18.55;
	
	salarioFinal = salarioInicial+acrescimo; 
	
	System.out.println("O acr�scimo ser� de: "+acrescimo);
	
	System.out.println("O sal�rio final � de: "+salarioFinal); 
}
}
