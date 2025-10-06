package prjLaco;

import java.util.Scanner;

public class Tabuada {

	public static void main (String [] args) {
		
		Scanner in = new Scanner (System.in);
		int i, n, r;
		
		i = 1; 
		
		System.out.println("Insira o número:");
		n = in.nextInt();

		while (i<=10) {
			
			r = n * i;
			System.out.println( n + "x" + i + "=" + r);
			
			i++;
		}

	}
}
