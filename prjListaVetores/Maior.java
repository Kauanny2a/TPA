package listaVetores;
import java.util.Scanner; 
public class Maior {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], b[], c[], i;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite os valores do vetor A: ");
			a[i] = in.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite os valores do vetor B: ");
			b[i] = in.nextInt();
		}
		
	for (i =0; i<TAM;i++) {
		if (a[i] > b[i]){ 
			c[i] = 1;	
		} else if (a[i] < b[i])  {
			c[i] = -1;
		} else {
			c[i] = 0;
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
		System.out.println("\n Vetor C:");
		for (i=0; i<TAM; i++) {
			System.out.print(c[i] + " ");
	}
	}
}

