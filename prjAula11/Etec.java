package listaVetores;
public class Etec {

	public static void main(String[] args) {
		 
		int senhas[] = new int [10];
		int i, senha, quantidade, repetida;
		quantidade = 0;
		
		while (quantidade<10) {
			senha=(int)(Math.random()*100);
			repetida = 0; 
			
			for (i=0; i<quantidade; i++) {
				if (senhas[i] == senha) {
					repetida = 1;
				}
			}
			if (repetida==0) {
				senhas[quantidade] = senha;
				System.out.println ("Senha gerada: " + senha);
				quantidade++; 
			}
		}
		
	}

}
