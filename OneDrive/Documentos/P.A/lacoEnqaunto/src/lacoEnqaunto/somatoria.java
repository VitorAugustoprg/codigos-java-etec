package lacoEnquanto;
import java.util.Scanner;
public class somatoria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int i=1, somatoria; 
		
		while(i <= 101) {
			somatoria = i*50;
			
			System.out.println(somatoria);
			
		i++;
		}
		
		in.close();	
	}
}
