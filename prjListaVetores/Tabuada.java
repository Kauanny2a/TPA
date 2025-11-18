package listaVetores;
import java.util.Scanner; 
public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		final int TAM = 5;
		int i, a[],  r; 
		
		a = new int [TAM]; 
		
		System.out.println("Digite 5 números; ");
		 
		for (i=0; i<TAM; i++) {
			a[i] = in.nextInt();
			
			for (i=0; i<TAM; i++) {
				System.out.println("A tabuada do número " + a[i] " :");
			}
				for (r=0; r<=10; r++) {
			System.out.println( a[i] + "x" + r + "=" + (a[i] * r));
		}

	}
}
