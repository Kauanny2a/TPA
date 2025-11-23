package listaVetores;
import java.util.Scanner; 
public class Polindromo {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], i;
		
		a = new int[TAM];
		
		System.out.println("Insira os números do vetor A: ");
			for (i=0; i<TAM; i++) {
				a[i] = in.nextInt();
			}
		
			
				if (a[0] == a[9] && a[1] == a[8] && a[2] == a[7] && a[3] == a[6] && a[4]== a[5]) {
					
					System.out.println("Esse é um número palíndromo");
					
				} else {
					System.out.println("Esse não é um número palíndromo");
				}
			
	
	}
}


