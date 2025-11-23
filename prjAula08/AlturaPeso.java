package prjLacoPara;

import java.util.Scanner;

public class AlturaPeso {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, idade, maior, velha, nova, soma, idadeDez, n;
		
		double alt, p, media = 0;
		
		
		velha = 0;
		nova = 9999;
		maior = 0;
		soma = 0;
		idadeDez = 0;
		p = 0;
		n = 0;
		int porc = 0;
		
		
		i = 1;
		
		for (i=1; i<=25; i++) {
			System.out.println("Digite a idade da " + i + "a pessoa: ");
			idade = in.nextInt();
			System.out.println("Digite a altura da " + i + "a pessoa: ");
			alt = in.nextDouble();
			System.out.println("Digite o peso da " + i + "a pessoa: ");
			p = in.nextDouble();
			
			if (idade > 50) {
				maior = maior + 1;
			}
			
				if (idade >= 10 && idade <=20){
					idadeDez = idadeDez +1;
					soma += alt;
					
				}
				
				media = soma / idadeDez;
				
				if (p < 40){
					n = n +1;
					
				}
			
				porc = (n/25) * 100;
				
			if (idade > velha) {
				velha = idade;
			}  if (idade < nova) {
				nova = idade;
			}
			
			
			
			
		}
		
		System.out.println("Quantidade de pessoas com idade superior a 50: " + maior);
		
		System.out.println("Média da altura das pessoas com idade de 10 a 20 anos: " + media);
	
		System.out.println("Porcentagem de pessoas com peso inferior a 40kg: " + porc + "%");
		
		System.out.println("Idade da pessoa mais velha: " + velha);
		System.out.println("Idade da pessoa mais nova: " + nova);
		

	}

}
