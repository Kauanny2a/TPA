package prjVetores;

import java.util.Scanner;

public class Invertido {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int a[], b[], i, ref; 
		final int TAM = 10; 
		a= new int [TAM];
		b= new int [TAM];
		ref= 9;
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + " valor do vetor A: ");
			a[i] = in.nextInt ();
			b[ref] = a[i]; 
			ref--;
		}
		
		System.out.print("B = [");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
	}

}
