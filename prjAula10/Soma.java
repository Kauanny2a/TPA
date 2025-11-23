package prjVetores;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int a[], b[], c[], i;
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ " valor do vetor A");
			a[i] = in.nextInt();
		}

		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ " valor do vetor B");
			b[i] = in.nextInt();
			c[i] = a[i] + b[i];
		}
		
		System.out.print("a = [");
		
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print("]");
		
		
		System.out.print("b = [");
		
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]");	
		
		
		System.out.print("c = [");
		
		for (i=0; i<TAM; i++) {
			System.out.print(c[i]+ " ");
		}
		System.out.print("]");	
	}

}
