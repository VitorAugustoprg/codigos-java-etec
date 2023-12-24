import java.util.Scanner;
public class NumerosPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		  int rest=0 ,i ,n,r;
	       
	       System.out.println("Digite um número para saber se é primo: ");
	       n = in.nextInt();
	       
	       for(i= 1; i <= n; i++) {
	    	   r = n % i;
	    	   if(r == 0) {
	    		   rest = rest+1;
	    	   }
	       }
	       if(rest == 2) {
			   System.out.println("é um primo.");
		   }else {
			   System.out.println("Não é um primo.");
		   }
	       in.close();
	}
}
