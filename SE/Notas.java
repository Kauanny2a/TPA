package prjRevisao;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
	
		Scanner in =  new Scanner (System.in);
		double n1, n2, n3, n4, mi, nm, ex;
		
		System.out.println ("Digite a primeira nota:");
		n1 = in.nextDouble();
		System.out.println ("Digite a segunda nota:");
		n2 = in.nextDouble();
		System.out.println ("Digite a terceira nota:");
		n3 = in.nextDouble();
		System.out.println ("Digite a quarta nota:");
		n4 = in.nextDouble();
		
		mi = (n1+n2+n3+n4)/4;
		System.out.println("Sua média é:"+mi);
		if (mi<5) {
			System.out.println ("Reprovado");
		} else if (mi>=7) { 
			System.out.println ("Aprovado");
		} else {
			System.out.println ("Em exame");
			System.out.println ("Digite a nota do exame:");
			ex = in.nextDouble();
			nm = (mi+ex)/2;
			System.out.println ("Apresente a nova média:"+nm);
			if (nm>=7) {
				System.out.println ("Aprovado");
			} else {
				System.out.println ("Reprovado");
			}
			
		}
	}

}
