package familia58;

import java.util.Scanner;

public class Exercicio4Matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int valor, x, y, op;

		for (x = 0; x < 2; x++) {
			for (y = 0; y < 2; y++) {

				System.out.println("\nEntre com o valor da Matriz1: ");
				matriz1[x][y] = leia.nextFloat();
				System.out.println("\nEntre com o valor da Matriz2: ");
				matriz2[x][y] = leia.nextFloat();

			}
		}

		do {
			System.out.println("\n\t\tMenu de opções: ");
			System.out.println("\n1 - Somar as duas matrizes");
			System.out.println("\n2 - Subtrair a primeira matriz da segunda");
			System.out.println("\n3 - Adicionar uma constante às duas matrizes");
			System.out.println("\n4 - Imprimir as matrizes");
			System.out.println("\n0 - Sair do programa");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				for (x = 0; x < 2; x++) {
					for (y = 0; y < 2; y++) {

						matriz3[x][y] = matriz1[x][y] + matriz2[x][y];
						System.out.println("\nSoma: " + matriz3[x][y]);

					}
				}
				break;

			case 2:
				for (x = 0; x < 2; x++) {
					for (y = 0; y < 2; y++) {

						matriz3[x][y] = matriz2[x][y] - matriz1[x][y];
						System.out.println("\nDiferença: " + matriz3[x][y]);

					}
				}
				break;

			case 3:
				System.out.println("\nEntre com um valor: ");
				valor = leia.nextInt();

				for (x = 0; x < 2; x++) {
					for (y = 0; y < 2; y++) {

						matriz1[x][y] += valor;
						matriz2[x][y] += valor;
						System.out.println("\nMatriz 1: " + matriz1[x][y]);
						System.out.println("\nMatriz 2: " + matriz2[x][y]);
					}
				}
				break;
				
			case 4:
				for (x = 0; x < 2; x++) {
					for (y = 0; y < 2; y++) {

						System.out.println("\nMatriz 1: " + matriz1[x][y]);
						System.out.println("\nMatriz 2: " + matriz2[x][y]);
					}
				}
				break;
				
			case 0:
				System.out.println("\nMuito obrigada por utilizar o nosso programa!");
				break;
				
				default:
					System.out.println("\nOpção inválida...");
			}

		} while (op != 0);

	}

}
