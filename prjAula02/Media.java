package aulaJava;

import java.util.Scanner;
 
public class Media {
	public static void main(String args[]) {
		
      Scanner ler = new Scanner(System.in);
      
      double nota1, nota2, nota3, nota4, mediaAritimetica;
 
      System.out.println("Digite as notas");
      nota1 = ler.nextDouble();
      nota2 = ler.nextDouble();
      nota3 = ler.nextDouble();
      nota4 = ler.nextDouble();
      
      mediaAritimetica = (nota1 + nota2 + nota3 + nota4)/4;
      
      System.out.println("O valor da sua média é: "+ mediaAritimetica);
     
      
	}
 
}

