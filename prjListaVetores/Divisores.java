package listaVetores;
import java.util.Scanner; 
public class Divisores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], i, n;
		
		a = new int[TAM];
		n=1;
	
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i + 1) + " número:");
            a[i] = in.nextInt();
			
		}
		
		for ( i = 0; i < TAM; i++) {
            System.out.println("\nNúmero do A[" + i + "] = " + a[i]);
            System.out.println("Divisores de 0 até " + a[i] + ": ");
		
            for (n= 1; n <= a[i]; n++) {
                if (a[i] % n == 0) { 
                    System.out.print(n + " ");
                }
            }
		}
	}
}

