package prjListaSe;

import java.util.Scanner;

public class Salario {

	  public static void main (String [] args) {
	  
	     Scanner in = new Scanner (System.in); 
	     double s, irpf;

	     System.out.println ("Digite o valor do salário:"); 
	     s = in.nextDouble ();
	     
	     if (s<=1434.50){
	          System.out.println ("Não pago");
	     } else if (s<=2150.00) {
	           irpf = s*7.5/100-107.59;
	                System.out.println (irpf);
	           } else if (s<=2866.70) {
	                 irpf = s* 15.0/100-268.84;
	                      System.out.println (irpf);
	                 } else if (s<=3.582) {
	                        irpf= s*22.5/100-483.84;
	                             System.out.println (irpf);
	                        } else { 
	                          irpf = s*27.5/100-662.94;
	                               System.out.println (irpf);
	                        }
	  }
}
