package listaScanners;
import java.util.Scanner; 
public class MediaAritmetica {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in); 
		 
	double n1, n2, n3, media; 
	
	System.out.println("Digie a primeira nota: "); 
	n1 = ler.nextDouble();
	
	System.out.println("Digie a segunda nota: "); 
	n2 = ler.nextDouble();
	
	System.out.println("Digie a terceira nota: "); 
	n3 = ler.nextDouble();
	
	media = (n1+n2+n3)/3; 
	
	System.out.println("A média do aluno é: "+media);
	}

 
}
