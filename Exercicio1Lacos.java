package familia58;

import java.util.Scanner;

public class Exercicio1Lacos {

	public static void main(String[] args) {
		
		float n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("\nInsira o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("\nInsira o terceiro número: ");
		n3 = leia.nextFloat();
		
		if(n1 > n2 && n1> n3) {
			System.out.println("\nO maior número é: "+n1);
		}else if (n2 > n3) {
			System.out.println("\nO maior número é: "+n2);
		}else {
			System.out.println("\nO maior número é "+n3);
		}

	}

}
