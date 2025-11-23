package prjVetores;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i;
		double a[], media;
		final int TAM = 10;
		a = new double [TAM];
		media = 0;
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ " valor do vetor A: ");
			a[i] = in.nextInt();
			media = (a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7] + a[8] + a[9])/10;
		}
			System.out.println("A média é: " + media);
	}

}
