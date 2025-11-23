package listaVetores;
import java.util.Scanner;
public class Pesquisa {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		final int TAM = 10;
		int i, a[], x, posicao; 
		
		a = new int [TAM];
		posicao = 0; 
		
		System.out.println("Digite 10 números: ");
		for (i=0; i<TAM; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println("Pesquisa: ");
		x = in.nextInt();
		
		for (i=0; i<TAM; i++) {
			if (a[i] == x) {
				posicao=1;
			}
		}
		
			if(posicao==1) {
				System.out.println(x + "\nEstá amarzenado no vetor A ");
			} else {
				System.out.println(x + "\nNão está armazenado no vetor A");
			}
		}

	}


