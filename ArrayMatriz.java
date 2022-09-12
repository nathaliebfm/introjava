package familia58;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		int[][] numero = new int[2][3];
		int somaNumero=0, linha, coluna; //somaDiagonal=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				
				System.out.println("\nEntre com um número: ");
				numero[linha][coluna] = leia.nextInt();
				
				if(numero[linha][coluna]>0) {
					somaNumero += numero[linha][coluna];
				}
				
				/*Como somar os números da diagonal principal
				if(linha == coluna){
					somaDiagonal += numero[linha][coluna];*/
				
			}
		}
		
		System.out.println("\nSomatório dos números maiores que ZERO: "+somaNumero);

	}

}
