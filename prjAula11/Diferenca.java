package listaVetores;
import java.util.Scanner;
public class Diferenca {

	public static void main(String[] args) {
				Scanner in = new Scanner (System.in); 
				final int TAM = 10; 
				int i, a[], b[], c[], diferente; 

				a = new int [TAM];
				b = new int [TAM];
				c = new int [TAM]; 

				System.out.println("Digite os números do vetor A: ");
				for (i=0; i<TAM; i++) {
					a[i] = in.nextInt();
				}
				
				
				System.out.println("Digite os números do vetor B: ");
				for (i=0; i<TAM; i++) {
					b[i] = in.nextInt();
				}
				

				for (i=0; i<TAM; i++) {
					diferente = 0; 
				while (diferente<TAM && a[i] != b[diferente]){
					diferente++;
				}

				if (diferente == TAM) {
					c[i] = a[i];
				} else {
					c[i]=0;
						}
				}


				System.out.println ("\nA diferença entre A e B: ");
				for (i=0; i<TAM; i++) {
					if (c[i] != 0) {
					System.out.println (c[i] + " ");
					}
				}

	}

}
