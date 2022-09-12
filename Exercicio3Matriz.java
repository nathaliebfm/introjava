package familia58;

import java.util.Scanner;

public class Exercicio3Matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int contMaiores=0, linha, coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				
				System.out.println("\nEntre com um número para a linha "+linha+", coluna "+coluna);
				matriz[linha][coluna] = leia.nextInt();
				
				if (matriz[linha][coluna]>10) {
					contMaiores++;
				}
			}
		}
		
		System.out.println("\nEssa matriz possui "+contMaiores+" número(s) maior(es) que 10.");

	}

}
