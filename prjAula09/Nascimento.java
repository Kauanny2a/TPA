package prjAtividade;

import java.util.Scanner;

public class Nascimento {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in); 
		int ano, anoNasc, i, idade; 
		i=1; 
		idade=0; 
		
		
		
		do {
			System.out.println("Ano atual: ");
			ano= in.nextInt ();
			System.out.println("Digite o ano do seu nascimento: ");
			anoNasc = in.nextInt ();
			idade = ano - anoNasc; 
			System.out.println("Sua idade é: " + idade);
			System.out.println("Deseja continuar? 1-continua 0-sair");
			i = in.nextInt ();
			
		} while (i==1);
			
		
			i++; 
		
		
	}
}
