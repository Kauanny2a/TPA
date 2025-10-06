package prjFacaEnquanto;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int i, b, e, resultado;
		i = 1; 
		resultado = 1;
	
		System.out.println("coloque a base= ");
		b = in.nextInt ();
		System.out.println("coloque o expoente= ");
		e = in.nextInt ();
		
		if (e == 0) {
			System.out.println("1");
	} else 
		do {
			resultado =	resultado *b;
			i++; 
		} while (i<=e);
		
		System.out.println("A potência de " + b + " elevado a " + e + " é = " + resultado);
	}

}
