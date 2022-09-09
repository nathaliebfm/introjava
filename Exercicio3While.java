package familia58;

import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, contVinte=0, contCinquenta=0;
		
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			if(idade < 21) {
				contVinte++;
			}else if (idade > 50) {
				contCinquenta++;
			}
			
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nExistem "+contVinte+" pessoas com menos de 21 anos");
		System.out.println("\nExistem "+contCinquenta+" pessoas com mais de 50 anos");

	}

}
