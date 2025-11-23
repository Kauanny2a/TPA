package aulaJava;

import java.util.Scanner;
 
public class Prestacao {
	public static void main(String args[]) {
		
      Scanner ler = new Scanner(System.in);
      
      double valor, taxa, tempo, prestacao;
 
      System.out.println("Digite o valor");
      valor = ler.nextDouble();
      
      System.out.println("Digite a taxa");
      taxa = ler.nextDouble();
      
      System.out.println("Digite a quantidade de dias");
      tempo = ler.nextDouble();
      
      prestacao = valor + (valor * (taxa / 100) * tempo);
      
      
      System.out.println("O valor da prestação é: "+ prestacao);
     
      
	}
 
}