package familia58;

import java.util.Scanner;

public class Exercicio4Lacos {

	public static void main(String[] args) {
		
		double numero, raiz, potencia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		

			
		if(numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("\nO número inserido é par e a sua raíz quadrada é: %.2f",raiz);
			}else {
				potencia = Math.pow(numero, 2);
				System.out.printf("\nO número inserido é ímpar e elevando ele ao quadrado temos: %.2f",potencia);
			}
		}
	}

