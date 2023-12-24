package listaScanners;
import java.util.Scanner; 
public class SalarioFinal {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double salarioFinal, salarioInicial, dependentes, acrescimo; 
	
	System.out.println("Digite o salário: "); 
	salarioInicial = ler.nextDouble(); 
	
	System.out.println("Digite o número de dependentes: "); 
	dependentes = ler.nextDouble();
	
	acrescimo = dependentes*18.55;
	
	salarioFinal = salarioInicial+acrescimo; 
	
	System.out.println("O acréscimo será de: "+acrescimo);
	
	System.out.println("O salário final é de: "+salarioFinal); 
}
}
