package lacoEnqaunto;
import java.util.Scanner; 
public class numerosPares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1;
		
		while(i < 201) {
		
			if(i%2 == 0) {
				System.out.println(i);
			}
			i=i+1;	
		}
		
		in.close();
	}
}
