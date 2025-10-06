import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		int i, n, r;
		
			for (n=1; n<=10; n++) {
				
				for (i=1; i<=10; i++) {
					r= n * i;
					System.out.println(n+"x" +i+ "=" + r);
			}
		} 
	}

}
