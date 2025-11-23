package listaVetores;
import java.util.Scanner; 
public class Impares {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		final int TAM = 10;
		
		int a[], b[], i;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite os valores do vetor A: ");
			a[i] = in.nextInt();
		}
		
	for (i =0; i<TAM;i++) {
		
	
		if (a[i] %2 == 0){ 
			b[i] = 1;	
		} else {
			b[i] =0;
		}
	}
	
	System.out.println("Vetor A:");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n Vetor B:");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
	}
	
	}
}
