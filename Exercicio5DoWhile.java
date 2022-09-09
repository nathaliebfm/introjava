package familia58;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		
		float numeros, contNum=0, somaNum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		numeros = leia.nextFloat();
		
		do {
			if(numeros == 0) {
				System.out.println("\nSair do loop...");
			}else {
				somaNum += numeros;
				contNum++;
			}
			
			System.out.println("\nDigite um número: ");
			numeros = leia.nextFloat();
			
		}while (numeros != 0);
		
		if(contNum == 0) {
			System.out.println("\nNão foi digitado nenhum número acima de 0, então a soma é 0");
		}else {
			System.out.println("\nSomando os "+contNum+" números digitados, temos o resultado: "+somaNum);
		}

	}

}
