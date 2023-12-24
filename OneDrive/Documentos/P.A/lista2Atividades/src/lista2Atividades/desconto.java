package lista2Atividades;
import java.util.Scanner; 
public class desconto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double preco, precoNovo;
		int porcentagem, desconto;
		
		porcentagem = 15;  
		
		System.out.println("Digite um preço: "); 
		preco = ler.nextDouble();
		
		desconto = (int)(preco/100)*porcentagem; 
		
		precoNovo = preco - desconto; 
		
		System.out.println("O desconto é de : "+porcentagem+"%");
		System.out.println("O valor com desconto é: "+precoNovo);
	}

}
