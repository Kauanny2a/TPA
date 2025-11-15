package prjLaco;

import java.util.Scanner;

public class IdadeLaco {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		int i, id, menor, maior;
		
		menor = 0;
		maior= 0;
		i = 1;
		
		System.out.println("Digite a idade de 5 alunos ");
		
		while (i<=5) {
			System.out.println(i + "° aluno =");
			id = in.nextInt();
		
			if (id>=18) {
				maior = maior + 1;
			} else {
				menor = menor + 1;
			}
			
			i = i + 1;
		}
				System.out.println("Menores de idade: " + menor);
				System.out.println("Maiores de idade: " + maior);
	}

}
