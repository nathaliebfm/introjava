package familia58;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {
		
		int [] A = new int [] {1, 0, 5, -2, -5, 7};
		int somaVetor=0, x;
		
		Scanner leia = new Scanner(System.in);
		
		//Apresentação do vetor inicial
		System.out.println("\nVetor A inicial: ");
		System.out.println(Arrays.toString(A));
		
		//Soma dos valores do vetor
		somaVetor = A[0]+A[1]+A[5];
		System.out.println("\nSoma das posições 0, 1 e 5 do vetor A: "+somaVetor);
		
		//Alterar o valor da posição 4
		A[4] = 100;
		
		//Imprimir novo vetor
		System.out.println("\nNovo vetor A após alterar a posição 4: ");
		for(x=0;x<6;x++) {
			System.out.println(A[x]);
		}

	}

}
