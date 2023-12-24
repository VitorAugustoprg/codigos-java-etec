package listaSwitchCase;
public class Crescimento {
	public static void main(String[] args) {
		int i = 0;
		double alturaJoao = 134, alturaPedro = 145;
		
		while(alturaJoao <= alturaPedro) {
			alturaJoao = alturaJoao + 2.5; 
			alturaPedro = alturaPedro + 2;
			
			i++;
		}
		System.out.println("Levará "+i+" anos para João ficar maior que Pedro.");
	}
}
