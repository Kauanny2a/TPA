package prjFacaEnquanto;

import java.util.Scanner;

public class Fatorial {
	
	public static void main (String [] args) {
		
		Scanner in = new Scanner (System.in);
		int i,n,r; 
		
		i = 1;
		r= 1;
		
		System.out.println("Digite um número inteiro: ");
		n = in.nextInt();
		
		do {
			r = r * i;
			i++;
		}while (i<=n);
			
		System.out.println("fatorial de " +n+ " é = " + r);
	
		}
	}


