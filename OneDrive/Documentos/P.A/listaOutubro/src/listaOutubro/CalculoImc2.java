package listaOutubro;
import java.util.Scanner;
public class CalculoImc2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		double peso, altura, imc; 
		
		System.out.println("Digite o peso: ");
		peso = in.nextDouble();
		
		System.out.println("Digite a altura: ");
		altura = in.nextDouble();
		
		imc = peso/(altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Excesso de magreza");
		}else if(imc < 25) {
			System.out.println("Peso normal");
		}else if(imc < 30) {
			System.out.println("Excesso de peso");
		}else if(imc < 35) {
			System.out.println("Obesidade grau I");
		}else if(imc < 40) {
			System.out.println("Obesidade grau II");
		}else {
			System.out.println("Obesidade garu III");
		}
		
		in.close(); 
	}
}
