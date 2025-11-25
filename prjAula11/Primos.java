package listaVetores;
import java.util.Scanner;
public class Primos {

		public static void main(String[] args) {
			Scanner in = new Scanner (System.in); 
			final int TAM = 10;
			int i, a[], n, divisores;
			
			a = new int [TAM];
			
			System.out.println("Digite um número: ");
			
				for (i=0; i<TAM; i++) {
					a[i] = in.nextInt();
				}

			    for (i=0; i<TAM; i++) {
					 divisores = 0;
						for (n=2; n<a[i];n++) {
							if (a[i]%n==0) {
								primo=0;
							}
						}
						
						if (divisores== 2) {
							System.out.println(a[i] + "é um número primo");
						} else {
							System.out.println(a[i] + "Não é um número primo");
						}
				 }
			}

		}


	

