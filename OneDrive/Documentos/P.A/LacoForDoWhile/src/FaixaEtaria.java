import java.util.Scanner;
public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade,altura,peso,n=10,i;
		double mediaAltura;
		
		for(i=1; i <= n;i++) {
			System.out.println("Digite a idade da "+i+"o. pessoa: ");
			idade = sc.nextInt();
			
			System.out.println("Digite a altura da "+i+"o. pessoa: ");
			altura= sc.nextInt();
			
			if(idade <= 10 && idade <= 20) {
			
			}
		}
		
		sc.close();
	}
}
