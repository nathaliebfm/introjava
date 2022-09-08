package familia58;

import java.util.Scanner;

public class Exercicio3Laços {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual o seu nome?");
		nome = leia.next();
		System.out.println("\n"+nome+", quantos anos você tem?");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("\n"+nome+", você está na categoria infanil!");
		}else if(idade>=15 && idade<=17) {
			System.out.println("\n"+nome+", você está na categoria juvenil!");
		}else if(idade>=18 && idade<=25) {
			System.out.println("\n"+nome+", você está na categoria adulto!");
		}else {
			System.out.println("\n"+nome+", você não se enquadra em nenhuma categoria! :(");
		}
		
	}

}
