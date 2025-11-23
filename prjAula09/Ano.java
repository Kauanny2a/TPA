package prjAtividade;

import java.util.Scanner;

public class Ano {

		public static void main(String[] args) {
			
			    Scanner in = new Scanner (System.in);
			    int ano, anoFinal, i; 
			    i=0; 
			    
			    System.out.println("Digite o ano Inicial: ");
			    ano = in.nextInt (); 
			    System.out.println(" Digite o ano final: ");
			    anoFinal = in.nextInt ();
			    
			    while (ano <= anoFinal) {
			    	if ((ano%4==0 && ano%100!=0) || ( ano%400==0)) {
			    		System.out.println("Ano bissexto: " + ano);
			    		i++; 
			    	}  ano++; 
			    }
			   
			    
			    System.out.println("Total de anos bissextos: " + i);
			  
			    
			    

	}
}