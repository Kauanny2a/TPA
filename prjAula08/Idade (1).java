package prjLacoPara;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		double renda, soma = 0, m = 0, rendaAlta = 0;
		int i = 1;
		
		
		for (i = 1; i<=40; i++) {
			System.out.println("Digite a renda do " + i +"º aluno");
			renda = in.nextDouble();
			
			soma = soma + renda;

			m = soma/40;
			
			if (renda >= rendaAlta) {
				rendaAlta = renda;
				
			}
			
		
	 } 
		
		System.out.println("A soma das rendas dos 40 alunos é:" + soma);
		System.out.println("A média das rendas dos 40 alunos é:" + m);
		System.out.println("A renda mais alta entre os 40 alunos é: " + rendaAlta);
	}

}
