package lista2Atividades;
import java.util.Scanner; 
public class prestacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valor, emprestimo, prestacao, valorTotal, juros; 
		int meses; 
		
		juros = 0.025; 
		
		System.out.println("Empr�stimo: ");
		emprestimo = ler.nextDouble();
		
		System.out.println("Meses: ");
		meses = ler.nextInt(); 
		// f�rmula de c�lculo: J = C . I . T, M = C + J
		prestacao = emprestimo*juros;
		valor = prestacao*meses; 
		valorTotal = valor+emprestimo;  
		
		System.out.println("Presta��o: "+prestacao);
		System.out.println("Valor total: "+valorTotal);
		
		// 1250 - 8x - juros: 250  - valor total a pagar: 1500
	}

}
