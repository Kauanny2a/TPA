package prjAtividade;

import java.util.Scanner;

public class Somatoria {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in); 
		int i, soma;
		soma=0;
		
		for (i=0; i<=400; i++) {
			if (i%5==0) {
				soma += i;
			} 
		}
		System.out.println("A soma dos múltiplos de 5 de 0 a 400 é: " + soma);
	}
}
