package familia58;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] numero = new int[6];
		int somaPar=0, contImpar=0;
		int x;
		
			
		for(x=0;x<6;x++) {
			System.out.println("\nEntre com um número: ");
			numero[x] = leia.nextInt();
		}
		
		
		System.out.println("\nNúmeros pares: ");
		for(x=0;x<6;x++) {
			if(numero[x] % 2 == 0) {
				System.out.println(numero[x]);
				somaPar += numero[x];
				}
		}
		
		System.out.println("\nNúmeros ímpares: ");
		for(x=0;x<6;x++) {
			if(numero[x] % 2 != 0) {
				System.out.println(numero[x]);
				contImpar++;
			}
		}
		
		System.out.println("\nSoma dos números pares: "+somaPar);
		System.out.println("\nQuantidade de números ímpares: "+contImpar);
	}

}
