package listaSwitchCase;
import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int rest=0 ,i=1 ,n,r;
       
       System.out.println("Digite um n�mero para saber se � primo: ");
       n = in.nextInt();
       
       while(i <= n) {
    	   r = n % i;
    	   if(r == 0) {
    		   rest = rest+1;
    	   }
    	   i = i+1;
    	  
       }
       if(rest == 2) {
		   System.out.println("� um primo;");
	   }else {
		   System.out.println("N�o � um primo.");
	   }
       in.close();
    }
}
