package listaVetores;
import java.util.Scanner;
public class Primos {

		public static void main(String[] args) {
			Scanner in = new Scanner (System.in); 
			final int TAM = 10;
			int i, a[], n, primo;
			
			a = new int [TAM];
			primo=0;
			
			System.out.println("Digite um número: ");
			
				for (i=0; i<TAM; i++) {
					a[i] = in.nextInt();
					if (a[i]<=1) {
						System.out.println("Não é um número primo");
					} else {
						primo = 1; 
						for (n=2; n<a[i];n++) {
							if (a[i]%n==0) {
								primo=0;
							}
						}
						
						if (primo == 1) {
							System.out.println(a[i] + "é primo");
						} else {
							System.out.println(a[i] + "Não é primo");
						}
					
			}

		}

	