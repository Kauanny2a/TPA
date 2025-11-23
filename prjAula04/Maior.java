package prjAula04;
import java.util.Scanner; 
public class Maior {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in); 
	     int a, b, c; 

	       System.out.println ("1° número:"); 
	       a = in.nextInt (); 
	        System.out.println ("2° número:"); 
	       b = in.nextInt ();
	       System.out.println ("3° número:"); 
	       c = in.nextInt ();

	       if (a<b && b<c) {
	           System.out.println (a+b+c);
	       } else if (a<c && c<b){
	            System.out.println (a+c+b);
	       } else if (b<a && c<a) { 
	             System.out.println (b+a+c);
	       } else if (b<c && c<a) {
	             System.out.println (c+a+b);
	       } else {
	              System.out.println (c+b+a);
	       }

	   
	}

}
