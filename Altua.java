package prjFacaEnquanto;

import java.util.Scanner;

public class Altua {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		int i, altPedro;
		i=0;
		altPedro= 145;
		double altJoao;
		altJoao= 134;
	
		do {
			altJoao = altJoao + 2.5;
			altPedro = altPedro + 2;
			i++;
		} while (altJoao<=altPedro);
		
		System.out.println("João irá fica mais alto em: " +i+ " anos");
	}

}
