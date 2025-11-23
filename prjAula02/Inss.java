package aulaJava;

import java.util.Scanner;
 
public class Inss {
	public static void main(String args[]) {
		
      Scanner ler = new Scanner(System.in);
      
      double numAulasMes, percentualDesconto, hora, salarioLiquido;
 
      System.out.println("Digite as horas");
      hora = ler.nextDouble();
      
      System.out.println("Digite o percentual");
      percentualDesconto = ler.nextDouble();
      
      System.out.println("Digite o número de aulas");
      numAulasMes = ler.nextDouble();
      
      salarioLiquido = (numAulasMes * hora) - percentualDesconto;
      
      
      System.out.println("O valor do INSS é: "+ salarioLiquido);
     
      
	}
 
}
