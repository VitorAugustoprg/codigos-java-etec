package lista2Atividades;
import java.util.Scanner; 
public class desconto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double preco, precoNovo;
		int porcentagem, desconto;
		
		porcentagem = 15;  
		
		System.out.println("Digite um pre�o: "); 
		preco = ler.nextDouble();
		
		desconto = (int)(preco/100)*porcentagem; 
		
		precoNovo = preco - desconto; 
		
		System.out.println("O desconto � de : "+porcentagem+"%");
		System.out.println("O valor com desconto �: "+precoNovo);
	}

}
