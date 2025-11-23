package listaVetores;
import java.util.Scanner;
public class ParesImpares {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		   final int TAM = 20;

	        int a[] = new int[TAM];
	        int b[] = new int[TAM];
	        int i, n = 0;

	        System.out.println("Digite 20 números:");
	        for (i = 0; i < TAM; i++) {
	            a[i] = in.nextInt();
	        }

	        for (i = 0; i < TAM; i++) {
	            if (a[i] % 2 == 0) {
	                b[n] = a[i];
	                n++;
	            }
	        }

	        for (i = 0; i < TAM; i++) {
	            if (a[i] % 2 != 0) {
	                b[n] = a[i];
	                n++;
	            }
	        }


	        System.out.println("\nVetor B (pares primeiro, depois ímpares):");
	        for (i = 0; i < TAM; i++) {
	            System.out.print(b[i] + " ");
	        }
	    }
	}
		

	}

}
