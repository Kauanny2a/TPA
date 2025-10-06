package prjLaco;

import java.util.Scanner;

public class NumeroLaco {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		int i, n;
		i= 1;
		n=0;
		
		System.out.println("Número de 1 a 100" );
		
		while (i<=100) {
			n = n + 1; 
			i++;	
			System.out.println(n);
		}
		
		
	}

}
