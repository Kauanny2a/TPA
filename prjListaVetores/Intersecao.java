package listaVetores;
import java.util.Scanner; 
public class Intersecao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		final int TAM = 10;
		int a[], b[], c[], i, repetido;
		
		a = new int[TAM];
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
			repetido=0; 
			for (repetido=0; repetido <10; repetido++) {
				if (a[i] == b[repetido]) {
					c[i] = a[i];
				}
				
			}
		}
	
		System.out.println("A interseção é: ");
			for (i=0; i<TAM; i++) {
				if (c[i] != 0) {
					System.out.print(c[i]+ " ");
				}
			
			} 

	}

}
