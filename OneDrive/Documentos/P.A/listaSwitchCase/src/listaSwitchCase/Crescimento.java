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
		System.out.println("Levar� "+i+" anos para Jo�o ficar maior que Pedro.");
	}
}
