package listaVetores;
import java.util.Scanner; 
public class Fatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 3;
		int a[], b[], i, n;
		
		a = new int[TAM];
		b = new int[TAM];
		n = 1;
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (i=1; i<TAM; i++) {
			a[i] = in.nextInt();
			
			for (n=1; n<a[i]; n++) {
				
			}
			
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("fatorial de " +a[i]+ "  = " + b[i]);
		}
		
		
		
	}
}

