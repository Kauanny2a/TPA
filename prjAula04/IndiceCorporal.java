package listaExercicios;
import java.util.Scanner;
public class IndiceCorporal {
		public static void main(String args[]) {
			
			Scanner in = new Scanner(System.in);
			
			double p, h, imc;
			
			System.out.println("Insira seu peso: ");
				p = in.nextDouble();
			
			System.out.println("Insira sua altura: ");
				h = in.nextDouble();
				
				imc = p/(h*h);
				
			System.out.println("Seu imc é: " + imc);
			
			if (imc < 18.5) {
				System.out.println("Voce está com excesso de magreza");
			} else if (imc <= 25) {
				System.out.println("Voce está com o peso normal");
			} else if (imc <= 35) {
				System.out.println("Voce está com Obesidade grau 1");
			} else if (imc <= 40) {
				System.out.println("Voce está com Obesidade grau 2");
			} else { 
				System.out.println("Voce está com Obesidade grau 3");
			}
					
			
		} // fim do metodo main
} 
