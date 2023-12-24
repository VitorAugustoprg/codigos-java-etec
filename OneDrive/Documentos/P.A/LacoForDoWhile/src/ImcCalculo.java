import java.util.Scanner;
public class ImcCalculo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double peso,altura,imc;
		int i;
		
		do {
			
			System.out.println("Digite o peso: ");
			peso = in.nextDouble();
			System.out.println("Digite a altura: ");
			altura = in.nextDouble();
			
			imc = peso/(altura*altura);
			
			if(imc < 18.5) {
				System.out.println("Abaixo do peso");
			}else if(imc < 25) {
				System.out.println("Peso ideal (parabéns)");
			}else if(imc < 30) {
				System.out.println("Levemente acima do peso");
			}else if(imc < 35) {
				System.out.println("Obesidade grau I");
			}else if(imc < 40) {
				System.out.println("Obesidade grau II (severa)");
			}else {
				System.out.println("Obesidade garu III (mórbida)");
			}
			System.out.println("Deseja continuar? (1-Sim / 2-Não)");
			i = in.nextInt();
		}while(i == 1);
		
		System.out.println("ENCERRANDO PROGRAMA...");
	}
}
