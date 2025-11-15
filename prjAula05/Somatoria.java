package prjLaco;

import java.util.Scanner;

public class Somatoria {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int i,n,r;
		i= 0;
		n= 0;
		
		while (i<=100) {
			n = i+i;
			i = i+1;
			r = n + i;
	
			System.out.println( n + "+" + i + "=" + r);
		}

	}

}
