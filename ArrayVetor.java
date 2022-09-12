package familia58;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		float[] media = new float[3]; //No java precisa instanciar o vetor com o new e aí indicar o tamanho, e normalmente separamos ele das outras variáveis
		float n1, n2, n3, somaMedia=0, mediaGeral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			System.out.printf("\nMédia Aritmética: %.2f", media[x]);
			somaMedia += media[x];
			
		}
		
		mediaGeral = somaMedia/3;
		System.out.printf("\nMédiaGeral: %.2f",mediaGeral);

	}

}
