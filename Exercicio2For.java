package familia58;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		
		float numeros, contPar=0, contImpar=0;
		int x ;
		
		Scanner leia = new Scanner (System.in);
		
		for (x=1;x<=10;x++) {
			
			System.out.println("\nEscreva um número: ");
			numeros = leia.nextFloat();
			
			if(numeros % 2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
		}
		
		System.out.println("\nVocê digitou "+contPar+" números pares.");
		System.out.println("\nVocê digitou "+contImpar+" números ímpares");

	}

}
