package prjAulaExercicios;

import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double n;
		
		n = in.nextDouble();
		
		if (n>0) {
			System.out.println("Positivo!");
		}else if(n<0){
			System.out.println("Negativo!");
		}else {
			System.out.println("Neutro!");
		}
		
			
	
	}

}
