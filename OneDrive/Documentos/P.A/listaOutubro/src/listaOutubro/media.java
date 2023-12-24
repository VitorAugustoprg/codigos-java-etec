package listaOutubro;
import java.util.Scanner;
public class media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		double n1, n2, n3, media, exameNota, exame;
		
		System.out.println("Digite a primeira nota: ");
		n1 = in.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		n2 = in.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		n3 = in.nextInt();
		
		media = (n1+n2+n3)/3; 
		
		if(media < 3) {
			System.out.println("REPROVADO");
		}else if(media >= 6){
			System.out.println("APROVADO");
		}else{
			System.out.println("ALUNO EM EXAME");
			System.out.println("Digite a nota do exame: ");
			exameNota = in.nextDouble(); 
			exame = (media+exameNota)/2; 
			if(exame >= 6) {
				System.out.println("APROVADO PELO EXAME");
			}else{
				System.out.println("REPROVADO");
			}
			in.close(); 
		}
	}
}
