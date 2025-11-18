package listaVetores;
import java.util.Scanner; 
public class Potencia {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM = 11;
		
		int i, n, a[];
		a = new int[TAM];
		n = 1;
		
		
		for (i=0; i<TAM; i++) {
			a[i] = n;
			n = n * 2;
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}


	
