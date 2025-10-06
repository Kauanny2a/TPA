package prjRevisao;

import java.util.Scanner;

public class Idade {
		public static void main(String [] args) {
			
			Scanner in = new Scanner(System.in);
			
			int a1, a2, a3, a4, a5, menor, maior, porcentagem1, porcentagem2;
			
			maior = 0;
			menor = 0;
			
			System.out.println("Digite a primeira idade: ");
			a1 = in.nextInt();
			
			System.out.println("Digite a segunda idade: ");
			a2 = in.nextInt();
			
			System.out.println("Digite a terceira idade: ");
			a3 = in.nextInt();
			
			System.out.println("Digite a quarta idade: ");
			a4 = in.nextInt();
			
			System.out.println("Digite a quinta idade: ");
			a5 = in.nextInt();
			
			
			if (a1>=18) {
				maior = maior +1;
			} else {
				menor = menor + 1;
			}
			
			if (a2 >=18) {
				maior = maior + 1;
			} else {
				menor = menor + 1;
			}
			
			if (a3 >=18) {
				maior = maior + 1;
			} else {
				menor = menor + 1;
			}
			
			if (a4 >=18) {
				maior = maior + 1;
			} else {
				menor = menor + 1;
			}
			
			if (a5 >=18) {
				maior = maior + 1;
			} else {
				menor = menor + 1;
			}
			
			System.out.println("Quantidade de menores de idade: " + menor);
			System.out.println("Quantidade de maiores de idade: " + maior);
			
			 porcentagem1 = (menor * 100)/maior;
			 System.out.println("A porcentagem de menores de idade é " + porcentagem1);
			 
			 porcentagem2 = (maior * 100)/maior- porcentagem1;
			 System.out.println("A porcentagem de maiores de idade é " + porcentagem2);
			 
		}
	}
