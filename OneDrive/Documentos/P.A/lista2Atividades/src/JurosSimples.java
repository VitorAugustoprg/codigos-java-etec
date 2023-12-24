import java.util.Scanner;
public class JurosSimples {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double juros, capital, taxa, tempo, montante;
		
		System.out.println("Digite o capital: ");
		capital = ler.nextDouble(); 
		
		System.out.println("Digite a taxa: ");
		taxa = ler.nextDouble();
		
		System.out.println("Digite o tempo: ");
		tempo = ler.nextDouble(); 
		
		juros = capital*taxa*tempo;
		montante = capital+juros; 
		
		System.out.println("Valor do juros: "+juros+"R$");
		System.out.println("Valor do montante: "+montante+"R$");
		
		ler.close(); 
	}

}
