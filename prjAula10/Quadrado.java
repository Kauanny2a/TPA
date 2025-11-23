package prjVetores;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int a[], b[], i;
		final int TAM = 10; 
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + " valor do Vetor A: ");
			a[i]= in.nextInt();
			b[i] = a[i] * a[i];
		}
		
		System.out.print("b = [");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
	}

}
