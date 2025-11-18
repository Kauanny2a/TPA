package listaVetores;
import java.util.Scanner; 
public class Multiplicacao {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		final int TAM = 5; 
		int i, a[], n, r;
		r = 0;
		a = new int[TAM];

		System.out.println("Digite 5 números inteiros: ");
		for (i=0; i<TAM; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println("Tabuada dos números digitados: ");
		
		for (i=0; i<TAM; i++) {
			for (n=0; n<=10; n++) {
				r = a[i] * n;
			System.out.println( a[i]+ "x" + n + "=" + r );
			
			}
		
		}
	}
}

